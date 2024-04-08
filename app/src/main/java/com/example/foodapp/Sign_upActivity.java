package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Sign_upActivity extends AppCompatActivity {

    LinearLayout lnrLogin;
    TextView txtLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initview();
    }


    private void initview()
    {
        lnrLogin = findViewById(R.id.lnrLogin);
        txtLogin = findViewById(R.id.txtLogin);

        lnrLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Sign_upActivity.this, Menu_ScreenActivity.class);
                startActivity(i);
                finish();
            }
        });

        txtLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               Intent i = new Intent(Sign_upActivity.this, Login_Activity.class);
               startActivity(i);
               finish();
            }
        });
    }
}