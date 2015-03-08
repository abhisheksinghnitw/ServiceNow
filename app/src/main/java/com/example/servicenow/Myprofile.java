package com.example.servicenow;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Myprofile extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_myprofile);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.myprofile, menu);
		return true;
	}

}
