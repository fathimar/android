package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.uname);
        password=(EditText)findViewById(R.id.pass);
    }

    public void myclickevent(View view) {
        String getusername=username.getText().toString();
        String getpassword=password.getText().toString();
        Toast.makeText(this,getusername+getpassword,Toast.LENGTH_LONG).show();
    }

}