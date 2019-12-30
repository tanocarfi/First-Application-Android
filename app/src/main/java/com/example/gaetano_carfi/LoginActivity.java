package com.example.gaetano_carfi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    public Button button;
    public EditText textUser;
    public EditText textPass;

    public String usr = "admin";
    public String pss = "gaetano.carfi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textUser = findViewById(R.id.user_title);
        textPass = findViewById(R.id.password_title);

        button = findViewById(R.id.button_enter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((textUser.getText().toString().equals(usr)) && (textPass.getText().toString().equals(pss))) {
                    Intent intent = new Intent(getApplicationContext(), CountryListActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), R.string.error,Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

