package com.example.schedulemodern;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ThursdayActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thursday);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_thursday, menu);
		return true;
	}
	
	public void onClick(View view)
	{
		TextView tv = (TextView) findViewById(R.id.textView1);
		
		switch(view.getId())
		{
			case R.id.button1:
				tv.setText("��������� �.�.");
				break;
		
			case R.id.button2:
				tv.setText("312 ��������� ������� �.�.");
				break;
	
			case R.id.button3:
				tv.setText("225 ��������� �������� �.�.");
				break;
			default:
				break;
		}
	}


}
