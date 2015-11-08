package com.example.admission_help;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class Business_Faculty extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_business__faculty);
		
		final Animation animationScalar=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
 		final Animation animationT=AnimationUtils.loadAnimation(this, R.anim.anim_translate);
 		final Animation animationAlfa=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
 		final Animation animationRotate=AnimationUtils.loadAnimation(this, R.anim.anim_rotate);


		
		
		
		Button button1=(Button) findViewById(R.id.accounting);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg0.startAnimation(animationRotate);
				
				
				Intent intent=new Intent(Business_Faculty.this, Accounting.class);
				startActivity(intent);
	


			}
		});
		

		Button button2=(Button) findViewById(R.id.management);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg10) {
		    	//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg10.startAnimation(animationRotate);
				
				Intent intent=new Intent(Business_Faculty.this, Management_Studies.class);
				startActivity(intent);
	
			 


			}
		});
		
		Button button3=(Button) findViewById(R.id.marketing);
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg110) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg110.startAnimation(animationRotate);
				
 
				Intent intent=new Intent(Business_Faculty.this, Marketing.class);
				startActivity(intent);
	

			}
		});
		Button button4=(Button) findViewById(R.id.finance);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg120) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg120.startAnimation(animationRotate);
				

				Intent intent=new Intent(Business_Faculty.this, Finance.class);
				startActivity(intent);
	
			


			}
		});
		
		Button button5=(Button) findViewById(R.id.banking);
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg140) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "Sorry...\nNo web site!!!", Toast.LENGTH_SHORT).show();
				arg140.startAnimation(animationRotate);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.business__faculty, menu);
		return true;
	}

}
