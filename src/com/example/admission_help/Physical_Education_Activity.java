package com.example.admission_help;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Physical_Education_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_physical__education_);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.physical__education_, menu);
		return true;
	}

}
