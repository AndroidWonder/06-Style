package com.course.example.style;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Style extends Activity {
    
	private TextView colors;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        colors = (TextView)findViewById(R.id.colored);
        
        int color = getResources().getColor(R.color.orange, null);
		colors.setTextColor(color);
		colors.setText("Hello World");

    } 
}