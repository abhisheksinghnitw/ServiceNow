package com.example.servicenow;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class Home extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

    public void categories(View view) {
        Intent i = new Intent(Home.this, Categories.class);
        startActivity(i);

        // close this activity
        finish();
    }

    public void settings(View view) {
        Intent i = new Intent(Home.this, Setting.class);
        startActivity(i);

        // close this activity
        finish();
    }

    public void profile(View view) {
        Intent i = new Intent(Home.this, Myprofile.class);
        startActivity(i);

        // close this activity
        finish();

    }

    public void nominate(View view) {
        Intent i = new Intent(Home.this, Nominate.class);
        startActivity(i);

        // close this activity
        finish();
    }

    public void walloffame(View view) {
        Intent i = new Intent(Home.this, Walloffame.class);
        startActivity(i);

        // close this activity
        finish();
    }
}
