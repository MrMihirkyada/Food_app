package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Login_Activity extends AppCompatActivity {

    LinearLayout lnrLogin;

    TextInputLayout edtname,edtPasswordToggle;
    TextView txtSignup,forgetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initview();
    }

    private void initview()
    {
        lnrLogin = findViewById(R.id.lnrLogin);
        txtSignup = findViewById(R.id.txtSignup);
        edtname = findViewById(R.id.edtname);
        edtPasswordToggle = findViewById(R.id.edtPasswordToggle);
        forgetPassword= findViewById(R.id.forgetPassword);


        lnrLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Login_Activity.this, Menu_ScreenActivity.class);
                Log.e("TAG", "onClick: "+"log in");
                startActivity(i);
                finish();
            }
        });

        txtSignup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Login_Activity.this,Sign_upActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}