package com.example.admission_help;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Pharmacy extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pharmacy);
		Button button1=(Button) findViewById(R.id.pharmacyweb);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			 
			//Toast.makeText(getApplicationContext(), "Somethings error!!!\nComing soon-Stay Close!", Toast.LENGTH_SHORT).show();
				Intent browserIntent = 
 		                new Intent(Intent.ACTION_VIEW, Uri.parse("http://dept.ru.ac.bd/phar/atrupharm.htm"));
 						startActivity(browserIntent);
	 		
			}
		});
	}

 

}
