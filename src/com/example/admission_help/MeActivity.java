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
import android.webkit.WebView;
import android.widget.Button;

public class MeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_me);
		
		
		final Animation animationScalar=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
 		final Animation animationT=AnimationUtils.loadAnimation(this, R.anim.anim_translate);
 		final Animation animationAlfa=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
 		final Animation animationRotate=AnimationUtils.loadAnimation(this, R.anim.anim_rotate);


		Button button0=(Button) findViewById(R.id.btn1);
		
		button0.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg01) {
			 
				arg01.startAnimation(animationRotate);
			}
		});
		
		
		Button button2=(Button) findViewById(R.id.btn2);
		
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg01) {
				// TODO Auto-generated method stub
				
				Intent browserIntent = 
                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
				startActivity(browserIntent);
				arg01.startAnimation(animationScalar);
			}
		});
		

		Button button3=(Button) findViewById(R.id.btn3);
		
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg10) {
				// TODO Auto-generated method stub
				
				Intent browserIntent = 
                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sksubrata.blogspot.com"));
				startActivity(browserIntent);
				arg10.startAnimation(animationScalar);
			}
		});
		
		
	Button button4=(Button) findViewById(R.id.btn4);
		
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg11) {
				// TODO Auto-generated method stub
				Intent browserIntent = 
		                new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail"));
						startActivity(browserIntent);
						arg11.startAnimation(animationT);
			}
		});
	
 			
 			
 			Button button6=(Button) findViewById(R.id.btn6);
 			
 			button6.setOnClickListener(new OnClickListener() {
 				
 				@Override
 				public void onClick(View arg01) {
 					// TODO Auto-generated method stub
 					
 					Intent browserIntent = 
 	                new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ruadmssion?ref=tn_tnmn"));
 					startActivity(browserIntent);
 					arg01.startAnimation(animationT);
 				}
 			});
 	 
		
	}
 
}
