package com.example.hh960.gamseongtrip2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initControl();
    }

    private void initControl() {
        Button quit= (Button) findViewById(R.id.button_quit);



        quit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this, InitialActivity.class);
               LoginActivity.this.startActivity(intent);

            }
        });}


}
