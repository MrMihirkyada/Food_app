package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.DatabaseUtils;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Order_Confrim_Activity extends AppCompatActivity {

    LinearLayout LnrBack,lnrConfirmOrders;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confrim);

        initview();
    }

    private void initview()
    {
        LnrBack = findViewById(R.id.LnrBack);
        lnrConfirmOrders = findViewById(R.id.lnrConfirmOrders);

        LnrBack.setOnClickListener(v ->
        {
            onBackPressed();
            super.onRestart();
        });

        lnrConfirmOrders.setOnClickListener(v ->
        {
            Intent i = new Intent(Order_Confrim_Activity.this,Payment_method_Activity.class);
            startActivity(i);
        });

    }
}