package com.kosaizone.schedule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Bibidh extends Activity {
	
	Button btn2;
	ListView areaList1;
	ArrayAdapter<String> adapter1;

	String[] selectarea1;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bibidh);
		
		btn2=(Button) findViewById(R.id.btnback);
		
		
		
		
		areaList1 = (ListView) findViewById(R.id.listView2);
		selectarea1 = getResources().getStringArray(R.array.SelectArea2);
		adapter1 = new ArrayAdapter<String>(Bibidh.this, R.layout.list,
				R.id.txtAreaView, selectarea1);

		areaList1.setAdapter(adapter1);

		areaList1.setOnItemClickListener(listener);
btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
		
		
	}

	
	OnItemClickListener listener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {

			switch (position) {
			case 0:
				Intent i0 = new Intent(Bibidh.this, Fozilot.class);
				startActivity(i0);
				break;
			case 1:
				Intent i1 = new Intent(Bibidh.this, Nyot.class);
				startActivity(i1);
				break;
			case 2:
				Intent i2 = new Intent(Bibidh.this, Tarabih.class);
				startActivity(i2);
				break;
			case 3:
				Intent i3 = new Intent(Bibidh.this, RojaVongerKaron.class);
				startActivity(i3);
				break;
			case 4:
				Intent i4 = new Intent(Bibidh.this, ShabEkadar.class);
				startActivity(i4);
				break;
			case 5:
				Intent i5 = new Intent(Bibidh.this, EidUlFitr.class);
				startActivity(i5);
				break;
			case 6:
				Intent i6 = new Intent(Bibidh.this, Developer.class);
				startActivity(i6);
				break;
			
			

			}

		}

	};
	
	

}
