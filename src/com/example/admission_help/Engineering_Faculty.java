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

public class Engineering_Faculty extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_engineering__faculty);
		
		
		final Animation animationScalar=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
 		final Animation animationT=AnimationUtils.loadAnimation(this, R.anim.anim_translate);
 		final Animation animationAlfa=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
 		final Animation animationRotate=AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
		
		
		
		Button button1=(Button) findViewById(R.id.appe);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg0.startAnimation(animationT);
				
				Intent intent=new Intent(Engineering_Faculty.this, APEE.class);
				startActivity(intent);
				
				 
				
			}
		});
		

		Button button2=(Button) findViewById(R.id.cse);			// For the change: 
																// Unit Layout to CSE layout. 
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg01) {
		 
				Intent intent=new Intent(Engineering_Faculty.this, CSE.class);
				startActivity(intent);                    
															//start the Intent
				
				arg01.startAnimation(animationT);          //For animation view 

				
			}
		});													// End of the This Layout.
		
		
		
		Button button3=(Button) findViewById(R.id.ice);
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg10) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				Intent intent=new Intent(Engineering_Faculty.this, ICE.class);
				startActivity(intent);
				
				arg10.startAnimation(animationT);
				
			}
		});
		Button button4=(Button) findViewById(R.id.acce);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg11) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(Engineering_Faculty.this, ACCE.class);
				startActivity(intent);
				
			
				arg11.startAnimation(animationT);
 			

			}
		});
		
		Button button5=(Button) findViewById(R.id.mse);
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg111) {
				
				Intent intent=new Intent(Engineering_Faculty.this, MSE.class);
				startActivity(intent);	
				
	 		arg111.startAnimation(animationT);
 

			}
		});
		
		
		Button button6=(Button) findViewById(R.id.eee);
		button6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg111) {
				
				Intent intent=new Intent(Engineering_Faculty.this, EEEActivity.class);
				startActivity(intent);	
				Toast.makeText(getApplicationContext(), "No web site at Now!!!\nComing soon-Stay Close!", Toast.LENGTH_SHORT).show();

	 		arg111.startAnimation(animationT);
 

			}
		});
		
	}
 

}
