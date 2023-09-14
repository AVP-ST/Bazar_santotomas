package com.example.bazar_santotomas;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Acceder extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceder);
    }

    public void onClickAbarrotes(View view)
    {
        Intent intent = new Intent(this,Abarrotes.class);
        startActivity(intent);
    }

    public void onClickFrutas(View view)
    {
        Intent intent = new Intent(this,Frutas.class);
        startActivity(intent);
    }

    public void onClickBebestibles(View view)
    {
        Intent intent = new Intent(this,Bebestibles.class);
        startActivity(intent);
    }

    public void onClickVerduras(View view)
    {
        Intent intent = new Intent(this,Verduras.class);
        startActivity(intent);
    }

}
