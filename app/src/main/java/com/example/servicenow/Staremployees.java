package com.example.servicenow;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Staremployees extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_staremployees);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.staremployees, menu);
		
		ListView lv = (ListView) findViewById(R.id.listView1);
		List<String> your_array_list = new ArrayList<String>();
        your_array_list.add("foo1");
        your_array_list.add("foo2");
        your_array_list.add("foo3");
        your_array_list.add("foo4");
        
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, 
                android.R.layout.simple_list_item_1,
                your_array_list);
        lv.setAdapter(arrayAdapter); 
		
		
		return true;
	}

}
