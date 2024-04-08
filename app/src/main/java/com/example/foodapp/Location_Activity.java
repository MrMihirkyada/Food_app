package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Location_Activity extends AppCompatActivity {

    LinearLayout LnrConfirm;

    ImageButton imgback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        initview();
    }

    private void initview()
    {
        LnrConfirm = findViewById(R.id.LnrConfirm);
        imgback = findViewById(R.id.imgback);

        LnrConfirm.setOnClickListener(v ->
        {
            final BottomSheetDialog OrderConfirm = new BottomSheetDialog(this);
            OrderConfirm.setContentView(R.layout.filter_location);
            LinearLayout lout=OrderConfirm.findViewById(R.id.loutMain);
            LinearLayout louts=OrderConfirm.findViewById(R.id.LnrConfirm);
            ((View)lout.getParent()).setBackgroundColor(ContextCompat.getColor(this, android.R.color.transparent));
            ((View)louts.getParent()).setBackgroundColor(ContextCompat.getColor(this, android.R.color.transparent));

            louts.setOnClickListener(v1 ->
            {
                OrderConfirm.dismiss();
            });
            OrderConfirm.show();
        });

        imgback.setOnClickListener(v ->
        {
            onBackPressed();
        });
    }
}