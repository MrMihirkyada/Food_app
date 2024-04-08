package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class WelcomeScreenActivity extends AppCompatActivity
{

    LinearLayout LnrContinue;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        if (Build.VERSION.SDK_INT >= 21)
        {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.greys));
        }


        initview();
    }

    private void initview()
    {
        LnrContinue = findViewById(R.id.LnrContinue);

        LnrContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(WelcomeScreenActivity.this,Login_Activity.class);
                startActivity(i);
                finish();
            }
        });
    }
}