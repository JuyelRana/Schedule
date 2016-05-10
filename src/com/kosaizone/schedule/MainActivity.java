package com.kosaizone.schedule;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView areaList;
	ArrayAdapter<String> adapter;

	String[] selectarea;

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		areaList = (ListView) findViewById(R.id.listView1);
		selectarea = getResources().getStringArray(R.array.SelectArea);
		adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.list,
				R.id.txtAreaView, selectarea);

		areaList.setAdapter(adapter);

		areaList.setOnItemClickListener(listener);

	}

	OnItemClickListener listener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position,
				long id) {

			switch (position) {
			case 0:
				Intent i0 = new Intent(MainActivity.this, Dhaka.class);
				startActivity(i0);
				break;
			case 1:
				Intent i1 = new Intent(MainActivity.this, Chittagong.class);
				startActivity(i1);
				break;
			case 2:
				Intent i2 = new Intent(MainActivity.this, Rajshahi.class);
				startActivity(i2);
				break;
			case 3:
				Intent i3 = new Intent(MainActivity.this, Khulna.class);
				startActivity(i3);
				break;
			case 4:
				Intent i4 = new Intent(MainActivity.this, Sylhet.class);
				startActivity(i4);
				break;
			case 5:
				Intent i5 = new Intent(MainActivity.this, Barisal.class);
				startActivity(i5);
				break;
			case 6:
				Intent i6 = new Intent(MainActivity.this, Rangpur.class);
				startActivity(i6);
				break;
			case 7:
				Intent i7 = new Intent(MainActivity.this, Patuakhali.class);
				startActivity(i7);
				break;
			case 8:
				Intent i8 = new Intent(MainActivity.this, Others.class);
				startActivity(i8);
				break;
			case 9:
				Intent i9 = new Intent(MainActivity.this, Bibidh.class);
				startActivity(i9);
				break;
			

			}

		}

	};
	
	
	
	
	@Override
	public void onBackPressed() {
	    new AlertDialog.Builder(this)
	    .setTitle(getTitle().toString())
	    //.setIcon(R.drawable.ic_launcher)
	           .setMessage("আপনি কি বের হয়ে যেতে চান?")
	           .setCancelable(true)
	           .setPositiveButton("হ্যাঁ", new DialogInterface.OnClickListener() {
	               public void onClick(DialogInterface dialog, int id) {
	                    MainActivity.this.finish();
	               }
	           })
	           .setNegativeButton("না", null)
	           .show();
	}

}
