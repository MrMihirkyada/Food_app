package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class Master_Card_Activity extends AppCompatActivity {

    LinearLayout LnrBack,LnrDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_card);
        

        initview();
    }

    private void initview()
    {
        LnrBack = findViewById(R.id.LnrBack);
        LnrDone = findViewById(R.id.LnrDone);

        LnrBack.setOnClickListener(v ->
        {
            onBackPressed();
        });
        LnrDone.setOnClickListener(v ->
        {
            Intent i = new Intent(Master_Card_Activity.this,Tack_Order_Activity.class);
            startActivity(i);
        });
    }
}