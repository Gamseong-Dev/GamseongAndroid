package com.example.hh960.gamseongtrip2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main0Activity extends AppCompatActivity  {
private Button b, button_register, button_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
        initControl();
    }
    private void initControl() {
        b = (Button) findViewById(R.id.next);
        button_register= (Button) findViewById(R.id.register);
        button_login = (Button) findViewById(R.id.login);


        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(Main0Activity.this, MainActivity.class);
                Main0Activity.this.startActivity(intent);

            }
        });

        button_register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(Main0Activity.this, RegisterActivity.class);
                Main0Activity.this.startActivity(intent);

            }
        });
        button_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(Main0Activity.this, LoginActivity.class);
                Main0Activity.this.startActivity(intent);

            }
        });


}

    }
