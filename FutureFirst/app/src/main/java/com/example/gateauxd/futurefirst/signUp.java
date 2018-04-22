package com.example.gateauxd.futurefirst;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarInputStream;


public class signUp extends AppCompatActivity {
    private static final String TAG = signUp.class.getName();

    private static final String url = "https://mysterious-headland-46181.herokuapp.com/signup";
    Button signupButton;
    private EditText Username;
    private EditText Password;
    private EditText Email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signupButton = (Button) findViewById(R.id.SignInButton);
    }


    public Button getSignupButton() {
        Log.d("aaaa", "hhhh");

        try {
            postData(url);
        }catch(IOException e){
            e.printStackTrace();
        }

        return signupButton;
    }

    void postData(String url) throws IOException{
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        Map<String, String> params = new HashMap<String, String>();

        params.put("Username", "Dan");
        params.put("Psword", "Password");
        params.put("Email", "dtran@hotmail.com");
        params.put("Gender", "Male");
        params.put("School", "University of California Merced");
        params.put("Major", "CSE");

        JSONObject parameter = new JSONObject();
        OkHttpClient client = new OkHttpClient();

        RequestBody body = RequestBody.create(JSON, parameter.toString());
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("content-type", "application/json; character=utf-8")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
            }

            @Override
            public void onResponse(Response response) throws IOException {
                Log.e("response", response.body().string());
            }
        });
    }
}
