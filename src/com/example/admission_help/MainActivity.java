package com.example.admission_help;

 
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

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView myBrowser;
		
		Button button0=(Button) findViewById(R.id.wellcome);
		Button button=(Button) findViewById(R.id.Admission);
		Button button2=(Button) findViewById(R.id.history);
		Button button3=(Button) findViewById(R.id.faculties);
		Button button4=(Button) findViewById(R.id.me);
		Button button5=(Button) findViewById(R.id.copy);
		
		
 		final Animation animationScalar=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
 		final Animation animationT=AnimationUtils.loadAnimation(this, R.anim.anim_translate);
 		final Animation animationAlfa=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
 		final Animation animationRotate=AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
 		

 		button0.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				 
			 
				arg0.startAnimation(animationRotate);
				
			}
		});
		
 		
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				 
				Intent intent=new Intent(MainActivity.this, Unit.class);
				startActivity(intent);
			 
				arg0.startAnimation(animationScalar);
				
			}
		});
		
		
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg1) {
				 Intent intent=new Intent(MainActivity.this, HistoryActivity.class);
				 startActivity(intent);
				 arg1.startAnimation(animationScalar);
			 
				
			}
		});
		
		
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg2) {
			 Intent intent=new Intent(MainActivity.this, FacultiesActivity.class);
			 startActivity(intent);
			 arg2.startAnimation(animationScalar);
				
			}
		});
		
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg3) {
				 
				 Intent intent=new Intent(MainActivity.this, MeActivity.class);
				 startActivity(intent);
				 arg3.startAnimation(animationRotate);
			}
		});
		
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg3) {
				
			 
			 
				arg3.startAnimation(animationScalar);
			}
		});
 
	}
  
}
