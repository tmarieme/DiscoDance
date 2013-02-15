package com.example.discodance;

import com.example.mini_projet.R;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MenuPrincipalActivity extends Activity {
	
	MediaPlayer mp;
	private TextView tv1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_principal);
		
		tv1 = (TextView) findViewById(R.id.textView1);
		tv1.setText("Elite Beat Agent");
		
		mp=MediaPlayer.create(this, R.raw.loop);
		mp.setLooping(true);
		mp.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_menu_principal, menu);
		return true;
	}
	
	@Override
	public void onStop() {
		mp.stop();
	}

}
