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

public class Social_Science_Faculty extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_social__science__faculty);
		
		
		final Animation animationScalar=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
 		final Animation animationT=AnimationUtils.loadAnimation(this, R.anim.anim_translate);
 		final Animation animationAlfa=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
 		final Animation animationRotate=AnimationUtils.loadAnimation(this, R.anim.anim_rotate);

		
		Button button1=(Button) findViewById(R.id.economic);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				 
				arg0.startAnimation(animationT);
				
				Intent intent=new Intent(Social_Science_Faculty.this, Economics.class);
				startActivity(intent);
		
			
			}
		});
		

		Button button2=(Button) findViewById(R.id.political);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg10) {
			 
				arg10.startAnimation(animationT);
				

				Intent intent=new Intent(Social_Science_Faculty.this, Political_Science.class);
				startActivity(intent);
			

			}
		});
		
		Button button3=(Button) findViewById(R.id.social);
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg01) {
 				arg01.startAnimation(animationT);
				
 				Intent intent=new Intent(Social_Science_Faculty.this, Social_Work.class);
				startActivity(intent);

			}
		});
		
		
		Button button4=(Button) findViewById(R.id.sociology);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg110) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg110.startAnimation(animationT);
				
				Intent intent=new Intent(Social_Science_Faculty.this, Sociology.class);
				startActivity(intent);
			

			}
		});
		
		Button button5=(Button) findViewById(R.id.mass);
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg120) {
				// TODO Auto-generated method stub
				
			 Toast.makeText(getApplicationContext(), "Sorry.There is no web site.!!!", Toast.LENGTH_SHORT).show();
				arg120.startAnimation(animationT);
				

//				Intent browserIntent = 
//	                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ru.ac.bd/law_faculty"));
//					startActivity(browserIntent);
//			

			}
		});
		
		Button button6=(Button) findViewById(R.id.publi);
		button6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg210) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg210.startAnimation(animationT);
				

				Intent intent=new Intent(Social_Science_Faculty.this, Public_Administration.class);
				startActivity(intent);
			

			}
		});
		
		
		Button button7=(Button) findViewById(R.id.information);
		button7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg310) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "Sorry...\nNo web site!!!", Toast.LENGTH_SHORT).show();
				arg310.startAnimation(animationT);

			}
		});
		
		Button button8=(Button) findViewById(R.id.anthropology);
		button8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg02) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg02.startAnimation(animationT);
				
				Intent intent=new Intent(Social_Science_Faculty.this, Anthropology.class);
				startActivity(intent);

			

			}
		});
		
		Button button9=(Button) findViewById(R.id.folkore);
		button9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg022) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "Sorry...\nNo web site!!!", Toast.LENGTH_SHORT).show();
				arg022.startAnimation(animationT);
				
				

			}
		});
		Button button10=(Button) findViewById(R.id.ir);
		button10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg04) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "Sorry...\nNo web site!!!", Toast.LENGTH_SHORT).show();
				arg04.startAnimation(animationT);

			}
		});
		
		
	}
 
}
