package com.example.tabhosttest;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;

public class tab_devide extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_devide);
		
		TabHost  tab_d = (TabHost)findViewById(R.id.tabhost);
		tab_d.setup();
		
		
		LayoutInflater i = LayoutInflater.from(this);
		i.inflate(R.layout.tab1, tab_d.getTabContentView());
		i.inflate(R.layout.tab2, tab_d.getTabContentView());
		
		tab_d.addTab(tab_d.newTabSpec("tab1").setIndicator("±Í«©1",null).setContent(R.id.LinearLayout01));
		tab_d.addTab(tab_d.newTabSpec("tab2").setIndicator("±Í«©2", null).setContent(R.id.LinearLayout02));
	}

	
}
