package com.example.servicenow;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Campaignforname extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_campaignforname);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.campaignforname, menu);
		
		//code for filling values in dropdown
		/*
		Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
		String[] items = new String[]{"1", "2", "three"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
		dropdown.setAdapter(adapter);
		*/
		return true;
	}

}
