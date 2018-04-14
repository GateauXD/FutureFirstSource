package com.example.gateauxd.futurefirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ProfilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
    }
    public void profileSettings(android.view.View view){
        android.content.Intent startNewActivity = new android.content.Intent(this, profileSettings.class);
        startActivity(startNewActivity);
    }
}
