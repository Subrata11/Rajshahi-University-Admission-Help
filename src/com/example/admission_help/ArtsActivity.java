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

public class ArtsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arts);
	 
		final Animation animationScalar=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
 		final Animation animationT=AnimationUtils.loadAnimation(this, R.anim.anim_translate);
 		final Animation animationAlfa=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
 		final Animation animationRotate=AnimationUtils.loadAnimation(this, R.anim.anim_rotate);

		
		
		
		Button button1=(Button) findViewById(R.id.a);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
 				
				//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg0.startAnimation(animationRotate);
				

				Intent intent=new Intent(ArtsActivity.this, Bangla.class);
				startActivity(intent);	
			}
		});
		

		Button button2=(Button) findViewById(R.id.b);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg10) {
				// TODO Auto-generated method stub
				
			//	Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg10.startAnimation(animationRotate);
				
				Intent intent=new Intent(ArtsActivity.this, English.class);
				startActivity(intent);

			}
		});
		
		Button button3=(Button) findViewById(R.id.c);
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg110) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Somethings error.\nComing soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg110.startAnimation(animationRotate);
				
				Intent intent=new Intent(ArtsActivity.this, History_Dept.class);
				startActivity(intent);

			}
		});
		
		
		Button button4=(Button) findViewById(R.id.d);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg01) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg01.startAnimation(animationRotate);
				Intent browserIntent = 
		                new Intent(Intent.ACTION_VIEW, Uri.parse("http://dept.ru.ac.bd/phi/index.php"));
						startActivity(browserIntent);
				

			}
		});
		
		Button button5=(Button) findViewById(R.id.e);
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg02) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "Sorry...\nNo web site!!!", Toast.LENGTH_SHORT).show();
				arg02.startAnimation(animationRotate);
				
				

			}
		});
	 
		
		
		Button button7=(Button) findViewById(R.id.g);
		button7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg04) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg04.startAnimation(animationRotate);
				Intent intent=new Intent(ArtsActivity.this, Islamic_History.class);
				startActivity(intent);
				

			}
		});
		
		Button button8=(Button) findViewById(R.id.h);
		button8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg05) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "Sorry...\nNo web site!!!", Toast.LENGTH_SHORT).show();
				arg05.startAnimation(animationRotate);
				
				

			}
		});
		
		Button button9=(Button) findViewById(R.id.i);
		button9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg06) {
				// TODO Auto-generated method stub
				
			 Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg06.startAnimation(animationRotate);
				
//				Intent browserIntent = 
//		                new Intent(Intent.ACTION_VIEW, Uri.parse("http://dept.ru.ac.bd/isd/index.html"));
//						startActivity(browserIntent);
//				

			}
		});
		Button button10=(Button) findViewById(R.id.j);
		button10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg07) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "Sorry...\nNo web site!!!", Toast.LENGTH_SHORT).show();
				arg07.startAnimation(animationRotate);
				
				

			}
		});
		
		Button button11=(Button) findViewById(R.id.k);
		button11.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg08) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "Sorry...\nNo web site!!!", Toast.LENGTH_SHORT).show();
				arg08.startAnimation(animationRotate);

			}
		});
	}
 
}
