package com.example.kevinbui.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView Info;
    private int counter = 5; // 5 attempts

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Name = (EditText)findViewById(R.id.etName);
       Password = (EditText)findViewById(R.id.etPassword);
       Login = (Button)findViewById(R.id.btn);
       Info = (TextView)findViewById(R.id.tvInfo);

       Info.setText("No of attempts remaining: 5"); // Set info text to this


       // Validate if Name and Password is the required fields
       Login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               validate(Name.getText().toString(), Password.getText().toString());
           }
       });

    }

    // Void because it is not returning anything
    private void validate(String userName, String userPassword){
        if ((userName.equals("Admin")) && (userPassword.equals("1234"))) {

            // To move onto next activity
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        } else {
            counter--;

            Info.setText("No of atttempts remaining: " + String.valueOf(counter)); // Converts int to sring

            if(counter == 0){
                // Disable button
                Login.setEnabled(false);
            }
        }
    }
}
