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

public class Law_Faculty extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_law__faculty);
		
		final Animation animationScalar=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
 		final Animation animationT=AnimationUtils.loadAnimation(this, R.anim.anim_translate);
 		final Animation animationAlfa=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
 		final Animation animationRotate=AnimationUtils.loadAnimation(this, R.anim.anim_rotate);

 
 		Button button2=(Button) findViewById(R.id.land);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {

				Intent intent=new Intent(Law_Faculty.this,LandActivity.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "No web site at Now!!!\nComing soon-Stay Close!", Toast.LENGTH_SHORT).show();
		 		 

 
			}
		});
		
		Button button1=(Button) findViewById(R.id.lawweb);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				//Toast.makeText(getApplicationContext(), "Coming soon-Stay Close!", Toast.LENGTH_SHORT).show();
				arg0.startAnimation(animationT);
				
					Intent browserIntent = 
		                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ru.ac.bd/law_faculty"));
						startActivity(browserIntent);
				
						

			}
		});
	}

 
}
