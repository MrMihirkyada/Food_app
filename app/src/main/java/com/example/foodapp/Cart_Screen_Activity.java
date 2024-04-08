package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Cart_Screen_Activity extends AppCompatActivity {

    LinearLayout LnrBack,lnrPlaceOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_screen);

        initview();

    }

    private void initview()
    {
        LnrBack = findViewById(R.id.LnrBack);
        lnrPlaceOrder = findViewById(R.id.lnrPlaceOrder);


        LnrBack.setOnClickListener(v ->
        {
            super.onRestart();
            onBackPressed();
        });

        lnrPlaceOrder.setOnClickListener(v ->
        {
            final BottomSheetDialog OrderConfirm = new BottomSheetDialog(this);
            OrderConfirm.setContentView(R.layout.place_order);
            LinearLayout lout=OrderConfirm.findViewById(R.id.btnPlaceOrder);
            LinearLayout louts=OrderConfirm.findViewById(R.id.lnrOrder);
            ((View)lout.getParent()).setBackgroundColor(ContextCompat.getColor(this, android.R.color.transparent));
            ((View)louts.getParent()).setBackgroundColor(ContextCompat.getColor(this, android.R.color.transparent));

            louts.setOnClickListener(v1 ->
            {
                Intent i = new Intent(Cart_Screen_Activity.this,Order_Confrim_Activity.class);
                startActivity(i);
            });
            OrderConfirm.dismiss();
            OrderConfirm.show();
        });


    }

}