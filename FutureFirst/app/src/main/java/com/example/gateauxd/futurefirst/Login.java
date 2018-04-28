
package com.example.gateauxd.futurefirst;
import java.net.Socket;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Login extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void signUp(View view){
        Intent startNewActivity = new Intent(this, signUp.class);
        startActivity(startNewActivity);
    }

/*    Client socket = new Client("192.168.0.8", 1234);
    socket.setClientCallback(new Client.ClientCallback () {
        @Override
        public void onMessage(String message) {
        }

        @Override
        public void onConnect(Socket socket) {
            socket.send("Hello World!\n");
            socket.disconnect();
        }

        @Override
        public void onDisconnect(Socket socket, String message) {
        }

        @Override
        public void onConnectError(Socket socket, String message) {
        }
    });

socket.connect(); */
}



