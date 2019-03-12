package com.example.kevinbui.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Info;
    private TextView Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Name = (EditText)findViewById(R.id.etName);
       Password = (EditText)findViewById(R.id.etPassword);
       Info = (Button)findViewById(R.id.btn);
       Login = (TextView)findViewById(R.id.tvInfo);

    }

    // Void because it is not returning anything
    private void validate(String userName, String userPassword){
        if ((userName == "Admin") && (userPassword == "1234")) {

            // To move onto next activity
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        }
    }
}
