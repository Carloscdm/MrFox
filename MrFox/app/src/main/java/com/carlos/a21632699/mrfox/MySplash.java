package com.carlos.a21632699.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MySplash extends AppCompatActivity {
    private ImageView img;
    private Animation rotacion;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_splash);
        img = findViewById(R.id.foxSplash);
        texto = findViewById(R.id.textView);

        getActionBar().hide();

        Typeface face = Typeface.createFromAsset(getAssets(),"fonts/AmaticSC-Regular.ttf");
        texto.setTypeface(face);

        Animation scale = AnimationUtils.loadAnimation(
                this, R.anim.rotar);
        img.setAnimation(scale);


        Thread tiempo = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(MySplash.this,MyLogin.class);
                    startActivity(intent);
                }
            }
        };
        tiempo.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
