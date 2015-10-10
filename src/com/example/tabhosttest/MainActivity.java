package com.example.tabhosttest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
//import com.example.tabhosttest.R;
//import android.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TabHost th = (TabHost)findViewById(R.id.tabhost);
		th.setup();		//初始化tab容器
		
		
		th.addTab(th.newTabSpec("tab1").setIndicator("标签1",null).setContent(R.id.tab1));
		th.addTab(th.newTabSpec("tab2").setIndicator("标签2", null).setContent(R.id.tab2));
	}

	

	
}
