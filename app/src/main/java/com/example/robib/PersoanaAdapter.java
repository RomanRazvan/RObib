package com.example.robib;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import static androidx.core.content.ContextCompat.startActivity;

public class PersoanaAdapter extends RecyclerView.Adapter<PersoanaAdapter.ViewHolder> {


    Context context;
    List<PersoanaModel> persoanaModelList;

    public PersoanaAdapter(Context context, List<PersoanaModel> persoanaModelList) {
        this.context = context;
        this.persoanaModelList = persoanaModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.design_row_for_recyclerview,parent,false);
        return new ViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        PersoanaModel persoanaModel=persoanaModelList.get(position);
        holder.tvDespre.setText("Despre: "+persoanaModel.getDespre());
        holder.tvNume.setText("Nume: "+persoanaModel.getNume());
        String imageUri=null;
        imageUri=persoanaModel.getImage();
        Picasso.get().load(imageUri).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return persoanaModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvNume, tvDespre;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image_recyclerView_id);
            tvNume=itemView.findViewById(R.id.tvNume_recyclerview_id);
            tvDespre=itemView.findViewById(R.id.tvDespre_recyclerview_id);


        }
    }


}
