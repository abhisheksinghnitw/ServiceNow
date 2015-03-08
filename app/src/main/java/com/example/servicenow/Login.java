package com.example.servicenow;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by akshatha on 7/3/15.
 */
public class Login extends Activity {

    private EditText username = null;
    private EditText password = null;

    private Button login;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.editText1);
        password = (EditText) findViewById(R.id.editText2);
        login = (Button) findViewById(R.id.login);
    }

    public void cancel(View view) {
        System.exit(0);
    }

    public void login(View view) {
        if (username.getText().toString().equals("admin") &&
                password.getText().toString().equals("admin")) {
            Intent i = new Intent(Login.this, Home.class);
            startActivity(i);

            // close this activity
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Wrong Credentials",
                    Toast.LENGTH_SHORT).show();

            counter--;

            if (counter == 0) {
                login.setEnabled(false);
                Toast.makeText(getApplicationContext(), "Exceeded 3 login attempts",
                        Toast.LENGTH_LONG).show();
                System.exit(0);
            }

        }
    }
}
