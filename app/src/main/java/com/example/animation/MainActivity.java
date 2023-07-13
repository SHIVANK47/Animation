package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView txtAim;
  Button btntranslate,btnAlpha,btnRotate,btnScale;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      txtAim = findViewById(R.id.txtAnim);
      btntranslate = findViewById(R.id.btntranslate);
      btnAlpha = findViewById(R.id.btnAlpha);
      btnScale = findViewById(R.id.btnscale);
      btnRotate = findViewById(R.id.Rotate);
      btntranslate.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Animation move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
              txtAim.startAnimation(move);
          }
      });

 btnAlpha.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
         txtAim.startAnimation(alpha);
     }
 });
 btnScale.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
         txtAim.startAnimation(scale);
     }
 });
 btnRotate.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
         txtAim.startAnimation(rotate);
     }
 });


    }
}