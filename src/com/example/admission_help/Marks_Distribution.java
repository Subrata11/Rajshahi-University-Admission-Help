package com.example.admission_help;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Marks_Distribution extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_marks__distribution);
		
		Button button1=(Button) findViewById(R.id.markdistribution);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			 
 				Intent browserIntent = 
 		                new Intent(Intent.ACTION_VIEW, Uri.parse("http://admission.ru.ac.bd/"));
 						startActivity(browserIntent);
	 		
			}
		});
		
	}
 
}
