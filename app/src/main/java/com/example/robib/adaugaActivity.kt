//package com.example.robib
//
//import android.app.Activity
//import android.content.Intent
//import android.content.pm.PackageManager
//import android.os.Build
//import android.os.Bundle
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import kotlinx.android.synthetic.main.adaugare.*
//import kotlinx.android.synthetic.main.altele.*
//
//class adaugaActivity: AppCompatActivity() {
//
//    private var IMAGE_PICK_CODE = 0
//    private var PERMISSION_CODE = 0
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.adaugare)
//        val actionBar = supportActionBar
//        actionBar?.setDisplayHomeAsUpEnabled(true)

//        gallery.setOnClickListener {
//            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
//                if(checkSelfPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED){
//                    val permission: Array<String> = arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE)
//                    requestPermissions(permission, PERMISSION_CODE)
//                }else{
//                    pickFromImageGallery()
//                }
//            }else{
//                pickFromImageGallery()
//            }
//        }
//    }
//    private fun pickFromImageGallery(){
//        val intent = Intent(Intent.ACTION_PICK)
//        intent.type = "image/*"
//        startActivityForResult(intent, IMAGE_PICK_CODE)
//    }
//
//    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//
//        when(requestCode){
//            PERMISSION_CODE->{
//                if(grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
//                    pickFromImageGallery()
//                }else{
//                    Toast.makeText(this, "Nu există persmisiune", Toast.LENGTH_LONG).show()
//                }
//            }
//        }
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if(resultCode == Activity.RESULT_OK && requestCode == IMAGE_PICK_CODE){
//            gallery.setImageURI(data?.data)
//        }
//    }
//}