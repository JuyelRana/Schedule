package com.kosaizone.schedule;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RojaVongerKaron extends Activity {
	
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_roja_vonger_karon);
		
		btn=(Button) findViewById(R.id.btnback);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			finish();
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.roja_vonger_karon, menu);
		return true;
	}

}
