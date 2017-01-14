package com.example.hh960.gamseongtrip2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main0Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);

        Button b;
        b = (Button)findViewById(R.id.next);
        b.setOnClickListener(this);

        Button register;
        register=(Button)findViewById(R.id.register);
        register.setOnClickListener(this);

        Button login;
        login= (Button)findViewById(R.id.login);
        login.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

        Intent intent1 = new Intent(this,LoginActivity.class);
        startActivity(intent1);
        finish();
    }

}


