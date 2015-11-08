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

public class Science_Faculty extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_science__faculty);
		
		final Animation animationScalar=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
 		final Animation animationT=AnimationUtils.loadAnimation(this, R.anim.anim_translate);
 		final Animation animationAlfa=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
 		final Animation animationRotate=AnimationUtils.loadAnimation(this, R.anim.anim_rotate);


		
		
		Button button1=(Button) findViewById(R.id.phy);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg044) {
				// TODO Auto-generated method stub
				
				
				Intent intent=new Intent(Science_Faculty.this, Physics.class);
				startActivity(intent);	
				
				// Toast.makeText(getApplicationContext(), "Somethings error!\nComing soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg044.startAnimation(animationRotate);
				 
				

			}
		});
		

		Button button2=(Button) findViewById(R.id.chem);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg0.startAnimation(animationRotate);
				
				Intent intent=new Intent(Science_Faculty.this, Chemistry.class);
				startActivity(intent);	

			}
		});
		
		Button button3=(Button) findViewById(R.id.stat);
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg10) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg10.startAnimation(animationRotate);
				 

				Intent intent=new Intent(Science_Faculty.this, Statistics.class);
				startActivity(intent);	
				

			}
		});
		Button button4=(Button) findViewById(R.id.pharmacy);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg120) {
				// TODO Auto-generated method stub
				
			//	Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg120.startAnimation(animationRotate);
				
				Intent intent=new Intent(Science_Faculty.this, Pharmacy.class);
				startActivity(intent);	
				

			}
		});
		
		Button button5=(Button) findViewById(R.id.math);
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg130) {
				// TODO Auto-generated method stub
				
			//	Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg130.startAnimation(animationRotate);
				
				Intent intent=new Intent(Science_Faculty.this, Mathematics.class);
				startActivity(intent);	
				 

			}
		});
		
		Button button6=(Button) findViewById(R.id.boiChem);
		button6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg140) {
			 
				
 				arg140.startAnimation(animationRotate);
 		
				Intent intent=new Intent(Science_Faculty.this, Biochemistry.class);
				startActivity(intent);	
 		

			}
		});
		
		
		Button button7=(Button) findViewById(R.id.amath);
		button7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg150) {
				 
				arg150.startAnimation(animationRotate);
				

				Intent intent=new Intent(Science_Faculty.this, Applied_Mathematics.class);
				startActivity(intent);	
				

			}
		});
		
		Button button8=(Button) findViewById(R.id.populaton);
		button8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg210) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "No web site.\nComing soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg210.startAnimation(animationRotate);
				
				
				 
				

			}
		});
		
		
		
		Button button9=(Button) findViewById(R.id.phy_education);
		button9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg150) {
				 
				arg150.startAnimation(animationRotate);
				

				Intent intent=new Intent(Science_Faculty.this, Physical_Education_Activity.class);
				startActivity(intent);	
				
				Toast.makeText(getApplicationContext(), "No web site.\nComing soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg150.startAnimation(animationRotate);

			}
		});
		
	}

	 

}
