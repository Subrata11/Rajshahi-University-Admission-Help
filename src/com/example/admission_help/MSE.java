package com.example.admission_help;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MSE extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mse);
		
		Button button1=(Button) findViewById(R.id.mseweb);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			 
			Toast.makeText(getApplicationContext(), "Somethings error!!!\nComing soon-Stay Close!", Toast.LENGTH_SHORT).show();
				
				
//				Intent browserIntent = 
//		                new Intent(Intent.ACTION_VIEW, Uri.parse("http://dept.ru.ac.bd/apee/"));
//						startActivity(browserIntent);
				
			}
		});
	}
 
}
