package com.example.schedulemodern;
import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MondayActivity extends Activity implements OnTouchListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_monday);
		RelativeLayout rl = (RelativeLayout) findViewById(R.id.activity);
		rl.setOnTouchListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_monday, menu);
		return true;
	}
	
	public void onClick(View view)
	{
		TextView tv = (TextView) findViewById(R.id.textView1);
		switch(view.getId())
		{
		case R.id.button1:
			tv.setText("211 аудитория Майданюк Н.В.");
			break;
		case R.id.button2:
			tv.setText("310 аудитория Шуклін Г.В.");
		  	break;
		
		case R.id.button3:
			tv.setText("217 аудитория Ремех Т.О.");
			break;
		default :
			break;
		}
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) 
	{
		/*float start = 0;
		Intent intent;
		switch(event.getAction())
		{
		case MotionEvent.ACTION_DOWN:
			start = event.getX();
			break;
		case MotionEvent.ACTION_UP:
			if(start<event.getX())
			{
				intent = new Intent(MondayActivity.this, MenuActivity.class);
				startActivity(intent);
				start = 0;
			}
			break;
		default:
			break;
		}*/
		return true;
	}

}
