package com.hva.commercialquiz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Button switchact =(Button)findViewById(R.id.button1);
        switchact.setOnClickListener(new View.OnClickListener() {
        
        	public void onClick(View view) {
        		Intent act2 = new Intent (view.getContext(), Activity2.class);
        		startActivity(act2);
        	}
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
