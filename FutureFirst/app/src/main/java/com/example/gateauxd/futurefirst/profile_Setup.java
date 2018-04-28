package com.example.gateauxd.futurefirst;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profile_Setup extends AppCompatActivity {

    Button button;

    private static final int PICK_IMAGES = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile__setup);

        button = (Button)findViewById(R.id.UploadImage);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openGallery();
            }
        });
    }

    public void profile_page(View view){
        Intent startNewActivity = new Intent(this, ProfilePage.class);
        startActivity(startNewActivity);
    }

    public void openGallery(){
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGES);
    }



}
