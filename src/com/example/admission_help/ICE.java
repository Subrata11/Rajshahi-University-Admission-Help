package com.example.admission_help;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ICE extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ice);
		
		Button button2=(Button) findViewById(R.id.iceweb);
		
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent browserIntent = 
                new Intent(Intent.ACTION_VIEW, Uri.parse("http://dept.ru.ac.bd/ice/"));
				startActivity(browserIntent);
			}
		});
		
	}

 

}
