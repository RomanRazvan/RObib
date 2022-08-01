package com.example.robib;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.google.firebase.storage.internal.StorageReferenceUri;

public class adaugareActivity extends AppCompatActivity {
    FirebaseDatabase mDatabase;
    DatabaseReference mRef;
    FirebaseStorage mStorage;
    ImageButton imageButton;
    EditText Nume, Despre;
    Button altele;
    private static final int Gallery_Code=1;
    Uri imageUrl=null;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.adaugare);

        imageButton=findViewById(R.id.imageButton);
        Nume=findViewById(R.id.Nume);
        Despre=findViewById(R.id.Despre);
        altele=findViewById(R.id.altele);

        mDatabase=FirebaseDatabase.getInstance();
        mRef=mDatabase.getReference().child("Persoana");
        mStorage= FirebaseStorage.getInstance();
        progressDialog=new ProgressDialog(this);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent=new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent,Gallery_Code);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==Gallery_Code && resultCode==RESULT_OK)
        {
            imageUrl=data.getData();
            imageButton.setImageURI(imageUrl);
        }
        altele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String fn=Nume.getText().toString().trim();
                final String ln=Despre.getText().toString().trim();

                if(!(fn.isEmpty() && ln.isEmpty() && imageUrl!=null))
                {
                    progressDialog.setTitle("Uploading...");
                    progressDialog.show();

                    StorageReference filpath=mStorage.getReference().child("imagePost").child(imageUrl.getLastPathSegment());
                    filpath.putFile(imageUrl).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {

                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            Task<Uri> downloadUrl=taskSnapshot.getStorage().getDownloadUrl().addOnCompleteListener(new OnCompleteListener<Uri>() {
                                @Override
                                public void onComplete(@NonNull Task<Uri> task){
                                    String t=task.getResult().toString();
                                    DatabaseReference newPost=mRef.push();
                                    newPost.child("Nume").setValue(fn);
                                    newPost.child("Despre").setValue(ln);
                                    newPost.child("image").setValue(task.getResult().toString());
                                    progressDialog.dismiss();

                                    Intent intent=new Intent(adaugareActivity.this,RetriveDataInRecycleView.class);
                                    startActivity(intent);
                                }
                            });
                        }
                    });
                }
            }
        });
    }
}
