package com.example.schedulemodern;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MenuActivity extends Activity {
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_menu, menu);
		return true;
	}
	
	public void onClick(View view)
	{
		switch(view.getId())
		{
		case R.id.Monday:
			intent = new Intent(MenuActivity.this, MondayActivity.class);
			break;
			
		case R.id.Tuesday:
			intent = new Intent(MenuActivity.this, TuesdayActivity.class);
			break;
			
		case R.id.Wednesday:
			intent = new Intent(MenuActivity.this, WednesdayActivity.class);
			break;
			
		case R.id.Thursday:
			intent = new Intent(MenuActivity.this, ThursdayActivity.class);
		break;
		
		case R.id.Friday:
			intent = new Intent(MenuActivity.this, FridayActivity.class);
			break;
		}
		startActivity(intent);
	}

}
