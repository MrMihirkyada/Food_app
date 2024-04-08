package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class AccountActivity extends AppCompatActivity {

    LinearLayout LnrMyOrder,LnrLogout,LnrBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        initview();
    }

    private void initview()
    {
        LnrMyOrder = findViewById(R.id.LnrMyOrder);
        LnrLogout = findViewById(R.id.LnrLogout);
        LnrBack = findViewById(R.id.LnrBack);

        LnrMyOrder.setOnClickListener(v ->
        {
            MyOrder();
        });

        LnrLogout.setOnClickListener(v ->
        {
            Logout();
        });

        LnrBack.setOnClickListener(v ->
        {
            onBackPressed();
        });
    }

    private void MyOrder()
    {
        Intent i = new Intent(AccountActivity.this,Cart_Screen_Activity.class);
        startActivity(i);
    }

    private void Logout()
    {
        Intent i = new Intent(AccountActivity.this,Login_Activity.class);
        startActivity(i);
    }
}