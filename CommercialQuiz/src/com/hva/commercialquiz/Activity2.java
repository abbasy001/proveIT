package com.hva.commercialquiz;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class Activity2 extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_2);
    final Button switchact =(Button)findViewById(R.id.button2);
    switchact.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent act1 = new Intent(view.getContext(),MainActivity.class);
        startActivity(act1);
      }
    });
}}
