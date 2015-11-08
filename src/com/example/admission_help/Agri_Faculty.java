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

public class Agri_Faculty extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_agri__faculty);
		
		final Animation animationScalar=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
 		final Animation animationT=AnimationUtils.loadAnimation(this, R.anim.anim_translate);
 		final Animation animationAlfa=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
 		final Animation animationRotate=AnimationUtils.loadAnimation(this, R.anim.anim_rotate);

		
		
		
		
		Button button1=(Button) findViewById(R.id.a);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "Sorry...\nNo web site!!!", Toast.LENGTH_SHORT).show();
				arg0.startAnimation(animationRotate);

			}
		});
		
		
		Button button2=(Button) findViewById(R.id.fish);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg01) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg01.startAnimation(animationRotate);
				
				Intent intent=new Intent(Agri_Faculty.this, Fisheries.class);
				startActivity(intent);	
				
			

			}
		});
		
		Button button3=(Button) findViewById(R.id.animal);
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg10) {
				 
				Toast.makeText(getApplicationContext(), "Sorry...\nThis web site is hacked by MalaysiaHacker!", Toast.LENGTH_SHORT).show();

 				arg10.startAnimation(animationRotate);
				
 				 
				

			}
		});
		Button button4=(Button) findViewById(R.id.crop);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg110) {
 				
 				arg110.startAnimation(animationRotate);
				

 				Intent intent=new Intent(Agri_Faculty.this,Crop_Science_and_Technology.class);
				startActivity(intent);	
				
			

			}
		});
		
	}
 

}
