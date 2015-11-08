package com.example.admission_help;

import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.Intents;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class Unit extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_unit);
		
		
 		final Animation animationScalar=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
 		final Animation animationT=AnimationUtils.loadAnimation(this, R.anim.anim_translate);
 		final Animation animationAlfa=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
 		final Animation animationRotate=AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
		
 
		
		
		Button button1=(Button) findViewById(R.id.reuslt);
		button1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg01) {
				// TODO Auto-generated method stub
				
						Intent browserIntent = 
		                new Intent(Intent.ACTION_VIEW, Uri.parse("http://admission.ru.ac.bd/result14.php"));
						startActivity(browserIntent);
		 				arg01.startAnimation(animationScalar);

				
					 
			}
		});
		
		Button button=(Button) findViewById(R.id.a);
		button.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(Unit.this, ArtsActivity.class);
				startActivity(intent);
 				arg0.startAnimation(animationScalar);
				
			}
		});
		
		
		Button button2=(Button) findViewById(R.id.b);
		button2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg1) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(Unit.this, Business_Faculty.class);
				startActivity(intent);
 				arg1.startAnimation(animationScalar);

				
				
			}
		});
		
		
		Button button3=(Button) findViewById(R.id.c);
		button3.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg2) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(Unit.this, Science_Faculty.class);
				startActivity(intent);
 				arg2.startAnimation(animationScalar);

				
				
			}
		});
		
		
		Button button4=(Button) findViewById(R.id.d);
		button4.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg3) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(Unit.this, Law_Faculty.class);
				startActivity(intent);
 				arg3.startAnimation(animationScalar);

				
				
			}
		});
		
		Button button5=(Button) findViewById(R.id.e);
		button5.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg4) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(Unit.this, Social_Science_Faculty.class);
				startActivity(intent);
 				arg4.startAnimation(animationScalar);

				
				
			}
		});
		
		Button button6=(Button) findViewById(R.id.f);
		button6.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg5) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(Unit.this, Bio_faculty.class);
				startActivity(intent);
 				arg5.startAnimation(animationScalar);

				
			}
		});
		
		Button button7=(Button) findViewById(R.id.g);
		button7.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg6) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(Unit.this, Agri_Faculty.class);
				startActivity(intent);
 				arg6.startAnimation(animationScalar);

				
			}
		});
		
		
		Button button8=(Button) findViewById(R.id.h);
		button8.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg7) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(Unit.this, Engineering_Faculty.class);
				startActivity(intent);
 				arg7.startAnimation(animationScalar);

				
			}
		});
		
		
		Button button8i=(Button) findViewById(R.id.i);
		button8i.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg7) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(Unit.this,Fine_Arts_Activity.class);
				startActivity(intent);
 				arg7.startAnimation(animationScalar);

				
			}
		});
		
		
		Button button9=(Button) findViewById(R.id.sits);
		button9.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "It is not Publish yet-Stay Close!", Toast.LENGTH_SHORT).show();
				
				
			}
		});
		
		
		Button button10=(Button) findViewById(R.id.rollnumber);
		button10.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg8) {
				// TODO Auto-generated method stub
				
				Intent browserIntent = 
		                new Intent(Intent.ACTION_VIEW, Uri.parse("http://admission.ru.ac.bd/rollquery14.php"));
						startActivity(browserIntent);
		 				arg8.startAnimation(animationRotate);
		 				//arg0.startAnimation(animationScalar);


				
			}
		});
		
		
		Button button11=(Button) findViewById(R.id.online);
		button11.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg9) {
				// TODO Auto-generated method stub
				
						Intent browserIntent = 
		                new Intent(Intent.ACTION_VIEW, Uri.parse("http://admission.ru.ac.bd/online_form.html"));
						startActivity(browserIntent);
		 				arg9.startAnimation(animationScalar);

				
				
			}
		});
		
		Button button12=(Button) findViewById(R.id.noticed);
		button12.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg10) {
				// TODO Auto-generated method stub
				
//						Intent browserIntent = 
//		                new Intent(Intent.ACTION_VIEW, Uri.parse("http://admission.ru.ac.bd/"));
//						startActivity(browserIntent);
				
			Intent intent=new Intent(Unit.this, Eligibility_For_Admission.class);
			startActivity(intent);
				
		 				arg10.startAnimation(animationScalar);

				
				
			}
		});
		
		
		Button button121=(Button) findViewById(R.id.mark);
		button121.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg10) {
 
			Intent intent=new Intent(Unit.this, Marks_Distribution.class);
			startActivity(intent);
				
		  	arg10.startAnimation(animationScalar);

				
				
			}
		});
		
		Button button13=(Button) findViewById(R.id.sitcapacity);
		button13.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg11) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Coming Soon-Stay Close!", Toast.LENGTH_SHORT).show();
			 	Intent intent=new Intent(Unit.this, Sits_capacity.class);
		     	startActivity(intent);
		     	
 				arg11.startAnimation(animationScalar);

				
				 // WebView m= (WebView)findViewById(R.id.sitcapacity);
			      
			     //  m.loadUrl("file:///android_asset/mypage.html");

		     	
				
			}
		});
		
	}
 

}
