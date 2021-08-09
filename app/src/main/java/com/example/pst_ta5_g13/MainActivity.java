package com.example.pst_ta5_g13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.service.autofill.TextValueSanitizer;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //ANIMACION.....................................................

        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation anim2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        TextView ebook = findViewById(R.id.ebook);
        ImageView logo = findViewById(R.id.logo);

        ebook.setAnimation(anim2);
        logo.setAnimation(anim1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class );
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}