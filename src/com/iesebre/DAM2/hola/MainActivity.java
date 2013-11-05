package com.iesebre.DAM2.hola;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.widget.*;

public class MainActivity extends Activity {
	
	private LinearLayout root;
	int count = 0;
	
	
	// Create an anonymous implementation of OnClickListener
	


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);
        LinearLayout.LayoutParams containerParams = new LinearLayout.LayoutParams(
        		ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, 0.0F);
        LinearLayout.LayoutParams widgetParams = new LinearLayout.LayoutParams(
        		ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT, 1.0F);
        root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.LTGRAY);
        root.setLayoutParams(containerParams);
        
        	LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        ll.setLayoutParams(containerParams);
        root.addView(ll);
        
        	LinearLayout lll = new LinearLayout(this);
        lll.setOrientation(LinearLayout.HORIZONTAL);
        lll.setBackgroundColor(Color.GRAY);
        lll.setLayoutParams(containerParams);
        root.addView(lll);
        
        EditText tb = new EditText(this);
        tb.setText(R.string.textesquerra);
        tb.setFocusable(true);
        tb.setLayoutParams(widgetParams);
        ll.addView(tb);
        
        EditText bt = new EditText(this);
        bt.setText(R.string.textdret);
        bt.setFocusable(true);
        bt.setLayoutParams(widgetParams);
        ll.addView(bt);
        
        Button but = new Button(this);

        but.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
            //Incrementing the variable count by 1 on every Touch
                count++;
                v.setBackgroundColor(Color.CYAN);
                Toast.makeText(MainActivity.this,
"aaaah, ara et canvio el color, molesta? " + count  + " times",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        but.setText(R.string.red);
        but.setTextColor(Color.RED);
        but.setLayoutParams(widgetParams);
        lll.addView(but);
        
        
        Button butt = new Button(this);
        butt.setText(R.string.green);
        butt.setTextColor(Color.GREEN);
        butt.setLayoutParams(widgetParams);
        lll.addView(butt);
        
        setContentView(root);
        
        
        
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    
}

