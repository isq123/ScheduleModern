package com.example.schedulemodern;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class FridayActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_friday);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_friday, menu);
		return true;
	}
	
	public void onClick(View view)
	{
		TextView tv = (TextView) findViewById(R.id.textView1);
		
		switch(view.getId())
		{
		case R.id.button1:
			tv.setText("320 аудитория Булига О.А.");
			break;
			
		case R.id.button2:
			tv.setText("309 аудитория Устименко О.В.");
		  	break;
		
		case R.id.button3:
			tv.setText("310 аудитория Кравченко В.Г.");
			break;
		
		case R.id.button4:
			tv.setText("303 аудитория Дакова Л.В.");
			break;
		default:
			break;
		}
	}

}
