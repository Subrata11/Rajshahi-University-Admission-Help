package com.example.admission_help;

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

public class FacultiesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_faculties);
		
		
		final Animation animationScalar=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
 		final Animation animationT=AnimationUtils.loadAnimation(this, R.anim.anim_translate);
 		final Animation animationAlfa=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
 		final Animation animationRotate=AnimationUtils.loadAnimation(this, R.anim.anim_rotate);

		
		Button button=(Button) findViewById(R.id.bt1);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(FacultiesActivity.this, ArtsActivity.class);
				startActivity(intent);
				arg0.startAnimation(animationT);
				
			}
		});
		
		 
		Button button1=(Button) findViewById(R.id.bt2);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg01) {
				Intent intent=new Intent(FacultiesActivity.this, Science_Faculty.class);
				startActivity(intent);
				arg01.startAnimation(animationT);

				
			}
		});
		
		
		Button button2=(Button) findViewById(R.id.bt3);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg10) {
				Intent intent=new Intent(FacultiesActivity.this, Engineering_Faculty.class);
				startActivity(intent);
				arg10.startAnimation(animationT);

				
			}
		});
		
		
		Button button3=(Button) findViewById(R.id.bt4);
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg110) {
				Intent intent=new Intent(FacultiesActivity.this, Agri_Faculty.class);
				startActivity(intent);
				arg110.startAnimation(animationT);

				
			}
		});
		
		Button button4=(Button) findViewById(R.id.bt5);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg210) {
				Intent intent=new Intent(FacultiesActivity.this, Business_Faculty.class);
				startActivity(intent);
				arg210.startAnimation(animationT);

				
			}
		});
		
		Button button5=(Button) findViewById(R.id.bt6);
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg310) {
				Intent intent=new Intent(FacultiesActivity.this, Science_Faculty.class);
				startActivity(intent);
				arg310.startAnimation(animationT);

			}
		}); 
		
		Button button6=(Button) findViewById(R.id.bt7);
		button6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg410) {
				Intent intent=new Intent(FacultiesActivity.this, Law_Faculty.class);
				startActivity(intent);
				arg410.startAnimation(animationT);

			}
		}); 
		
		Button button7=(Button) findViewById(R.id.bt8);
		button7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg510) {
				Intent intent=new Intent(FacultiesActivity.this, Bio_faculty.class);
				startActivity(intent);
				arg510.startAnimation(animationT);

			}
		}); 
		
		
		Button button71=(Button) findViewById(R.id.bt9);
		button71.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg510) {
				Intent intent=new Intent(FacultiesActivity.this, Fine_Arts_Activity.class);
				startActivity(intent);
				arg510.startAnimation(animationT);

			}
		}); 
		
		
		
		
		Button button8=(Button) findViewById(R.id.d);
		button8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg110) {
				 
				Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg110.startAnimation(animationRotate);
	 
			}
		}); 
		
		
		Button button9=(Button) findViewById(R.id.a);
		button9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg120) {
				 
				Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg120.startAnimation(animationRotate);
	 
			}
		}); 
		
		Button button10=(Button) findViewById(R.id.b);
		button10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg130) {
				 
				Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg130.startAnimation(animationRotate);
	 
			}
		}); 
		
		Button button11=(Button) findViewById(R.id.c);
		button11.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg140) {
				 
				Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg140.startAnimation(animationRotate);
	 
			}
		}); 
		
		
		Button button12=(Button) findViewById(R.id.dd);
		button12.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg150) {
				 
				Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg150.startAnimation(animationRotate);
	 
			}
		}); 
		
		Button button13=(Button) findViewById(R.id.e);
		button13.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg160) {
				 
				Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg160.startAnimation(animationRotate);
	 
			}
		}); 
		
		
		
		
	}
	
 
}
