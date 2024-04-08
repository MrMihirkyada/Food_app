package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Food_Item_Activity extends AppCompatActivity
{
    LinearLayout LnrBack,lnrlike,lnrbtnReserve;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_item);

        initview();
    }

    private void initview()
    {
        LnrBack = findViewById(R.id.LnrBack);

        lnrlike = findViewById(R.id.lnrlike);

        lnrbtnReserve = findViewById(R.id.lnrbtnReserve);

        LnrBack.setOnClickListener(view ->
        {
            onBackPressed();
        });

        lnrlike .setOnClickListener(view ->
        {
            dialog();
        });

        lnrbtnReserve.setOnClickListener(view ->
        {
            dialog();
        });
    }
    private void dialog()
    {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.bottom_dialog);
        LinearLayout lout=bottomSheetDialog.findViewById(R.id.loutMain);
        LinearLayout louts=bottomSheetDialog.findViewById(R.id.lnraddtocart);
        ((View)lout.getParent()).setBackgroundColor(ContextCompat.getColor(this, android.R.color.transparent));
        ((View)louts.getParent()).setBackgroundColor(ContextCompat.getColor(this, android.R.color.transparent));

        louts.setOnClickListener(v ->
        {
            Intent i = new Intent(Food_Item_Activity.this,Cart_Screen_Activity.class);
            startActivity(i);
            bottomSheetDialog.dismiss();
        });

        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.show();
    }
}