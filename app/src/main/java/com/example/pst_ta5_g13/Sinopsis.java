package com.example.pst_ta5_g13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Sinopsis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinopsis);

        TextView titulo = (TextView) findViewById(R.id.titusinop);
        TextView detalles = (TextView) findViewById(R.id.sinop);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b!=null){
            titulo.setText(b.getString("TIT"));
            detalles.setText(b.getString("DET"));

        }

    }
}





















