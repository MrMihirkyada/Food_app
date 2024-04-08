package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class Menu_ScreenActivity extends AppCompatActivity
{

    Spinner spnrCity;

    LinearLayout lnrshopping,LnrAccount;

    RelativeLayout reltitem;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        initview();
        item();
        cart();
        Profile();
    }

    private void initview()
    {
        spnrCity = findViewById(R.id.spnrCity);

        String[] Country ={"Ahmedabad","Ankleshwar","Bharuch","Surat","Vadodara","Bhavnagar","Rajkot","Jamnagar","Nadiad","Junagadh","Navsari","Rajkot","Gandinagar"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,Country);
        spnrCity.setAdapter(adapter);

    }
    private void item()
    {
        reltitem = findViewById(R.id.reltitem);

        reltitem.setOnClickListener(v ->
        {
            Intent i = new Intent(Menu_ScreenActivity.this,Food_Item_Activity.class);
            startActivity(i);

        });
    }
    private void cart()
    {
        lnrshopping = findViewById(R.id.lnrshopping);

        lnrshopping.setOnClickListener(v ->
        {
            Intent i = new Intent(Menu_ScreenActivity.this,Cart_Screen_Activity.class);
          
            startActivity(i);
        });
    }
    private void Profile()
    {
        LnrAccount = findViewById(R.id.LnrAccount);

        LnrAccount.setOnClickListener(v ->
        {
            Intent i = new Intent(Menu_ScreenActivity.this,AccountActivity.class);
            startActivity(i);
        });
    }
}