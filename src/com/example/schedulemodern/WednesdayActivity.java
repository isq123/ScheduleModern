package com.example.schedulemodern;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class WednesdayActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wednesday);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_wednesday, menu);
		return true;
	}
	
	public void onClick(View view)
	{
		TextView tv = (TextView) findViewById(R.id.textView1);
	
		switch(view.getId())
		{
		case R.id.button1:
			tv.setText("302 аудитория Булига О.А.");
			break;
		
		case R.id.button2:
			tv.setText("209 аудитория Шуклін Г.В.");
			break;
	
		case R.id.button3:
			tv.setText("310 аудитория Кравченко В.Г.");
			break;
		default:
			break;
		}
	}

}
