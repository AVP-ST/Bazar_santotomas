package com.example.bazar_santotomas;

import android.content.Intent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAcceder(View view)
    {
        Intent intent = new Intent(this,Acceder.class);
        startActivity(intent);
    }


}