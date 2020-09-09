package com.example.mf1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toast.makeText(getApplicationContext(),"Login Page",Toast.LENGTH_LONG).show();
        button=(Button)findViewById(R.id.button2);
    }

    public void onClick(View view){
        Intent intent=new Intent(login.this, com.androdocs.currentlocation.Main2Activity.class);
        startActivity(intent);
    }

}
