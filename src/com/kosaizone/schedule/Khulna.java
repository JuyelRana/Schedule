package com.kosaizone.schedule;

import android.os.Bundle;
import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

public class Khulna extends Activity {
	
	
	ListView areaList;
	ArrayAdapter<String> adapter1;

	String[] selectarea;
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_khulna);
		
		areaList = (ListView) findViewById(R.id.listView4);
		selectarea = getResources().getStringArray(R.array.Rajshahi_Area);
		adapter1 = new ArrayAdapter<String>(Khulna.this, R.layout.list2,
				R.id.txtAreaView2, selectarea);

		areaList.setAdapter(adapter1);

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
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);

		 SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
	        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();

	            searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
	            searchView.setIconifiedByDefault(false);   
	            
	            searchView.setSubmitButtonEnabled(true);
	         
	        SearchView.OnQueryTextListener textChangeListener = new SearchView.OnQueryTextListener() 
	        {
	            @Override
	            public boolean onQueryTextChange(String newText) 
	            {
	                // this is your adapter that will be filtered
	                adapter1.getFilter().filter(newText);
	                System.out.println("on text chnge text: "+newText);
	                return true;
	            }
	            @Override
	            public boolean onQueryTextSubmit(String query) 
	            {
	                // this is your adapter that will be filtered
	                adapter1.getFilter().filter(query);
	                System.out.println("on query submit: "+query);
	                return true;
	            }
	        };
	        searchView.setOnQueryTextListener(textChangeListener);

	        return super.onCreateOptionsMenu(menu);

	}

}
