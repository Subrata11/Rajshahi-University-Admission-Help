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

public class Bio_faculty extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bio_faculty);
		
		final Animation animationScalar=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
 		final Animation animationT=AnimationUtils.loadAnimation(this, R.anim.anim_translate);
 		final Animation animationAlfa=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
 		final Animation animationRotate=AnimationUtils.loadAnimation(this, R.anim.anim_rotate);


		
		
		Button button1=(Button) findViewById(R.id.geography);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
 				arg0.startAnimation(animationRotate);
				
 				Intent intent=new Intent(Bio_faculty.this, Geography.class);
				startActivity(intent);
				

			}
		});
		

		Button button2=(Button) findViewById(R.id.psychology);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg10) {
 				
 				arg10.startAnimation(animationRotate);
				
 				Intent intent=new Intent(Bio_faculty.this, Psychology.class);
				startActivity(intent);
				

			}
		});
		
		Button button3=(Button) findViewById(R.id.botany);
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg01) {
				 
				
 				arg01.startAnimation(animationRotate);
 				
 				Intent intent=new Intent(Bio_faculty.this, Botany.class);
				startActivity(intent);
				
				
				
				

			}
		});
		Button button4=(Button) findViewById(R.id.zoology);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg02) {
			 	
 				arg02.startAnimation(animationRotate);
				
 				Intent intent=new Intent(Bio_faculty.this, Zoology.class);
				startActivity(intent);
				

			}
		});
		
		
		Button button5=(Button) findViewById(R.id.mining);
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg012) {
 				
 				arg012.startAnimation(animationRotate);
				
 				Intent intent=new Intent(Bio_faculty.this, Geology_and_Mining.class);
				startActivity(intent);
				

			}
		});
		
		
		Button button6=(Button) findViewById(R.id.genetic);
		button6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg032) {
 				
 				arg032.startAnimation(animationRotate);
			 
 				Intent intent=new Intent(Bio_faculty.this, Genetic_engineering_and_biotechnology.class);
				startActivity(intent);

			}
		});		
		
		
		Button button7=(Button) findViewById(R.id.clinical);
		button7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0322) {
 				
 				arg0322.startAnimation(animationRotate);
			 
 				Intent intent=new Intent(Bio_faculty.this, ClinicalActivity.class);
				startActivity(intent);

			}
		});
	}
}
