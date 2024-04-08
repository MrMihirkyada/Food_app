package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Payment_method_Activity extends AppCompatActivity {

    LinearLayout LnrBack,LnrConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);

        initview();
    }

    private void initview()
    {
        LnrBack = findViewById(R.id.LnrBack);
        LnrConfirm = findViewById(R.id.LnrConfirm);

        LnrBack.setOnClickListener(v ->
        {
            super.onRestart();
            onBackPressed();
        });

        LnrConfirm.setOnClickListener(v ->
        {
            Intent i = new Intent(Payment_method_Activity.this,Master_Card_Activity.class);
            startActivity(i);
        });
    }
}