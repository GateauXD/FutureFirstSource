package com.example.gateauxd.futurefirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class ProfilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public String makeRequest(String URLRequest){
        StringBuilder sb;

        StringRequest stringRequest = new StringRequest(Request.Method.GET, URLRequest,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //Pares JSON response here!
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(HomeActivity.this, error.getMessage(), Toast.LENGTH_LONG);
//                Log.e(tag, "message request: "+ error.getMessage());
            }
        });

//        Volley.newRequestQueue(HomeActivity.this).add(stringRequest);
        return "";
    }
}
