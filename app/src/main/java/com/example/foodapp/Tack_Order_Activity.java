package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Tack_Order_Activity extends AppCompatActivity {

    TextView backHome;
    LinearLayout lnraddcart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tack_order);

        initview();
    }

    private void initview()
    {
        backHome = findViewById(R.id.backHome);
        lnraddcart = findViewById(R.id.lnraddcart);


        backHome.setOnClickListener(v ->
        {
            Intent i = new Intent(Tack_Order_Activity.this,Menu_ScreenActivity.class);
            startActivity(i);
        });

        lnraddcart.setOnClickListener(v ->
        {
            Intent i = new Intent(Tack_Order_Activity.this,Location_Activity.class);
            startActivity(i);
        });
    }
}