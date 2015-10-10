package com.example.tabhosttest;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

public class extend_tab extends TabActivity{

	protected void onCreate(Bundle savedInstanceState){
		 super.onCreate(savedInstanceState);  
	        setTitle("TabDemoActivity");  
	        TabHost tabHost = getTabHost();  
	        LayoutInflater.from(this).inflate(R.layout.extendtab,  
	                tabHost.getTabContentView(), true);  
	        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("tab1")  
	                .setContent(R.id.view1));  
	        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("tab2")  
	                .setContent(R.id.view2));  
	        
	          
	          
	         //标签切换事件处理，setOnTabChangedListener  
	        tabHost.setOnTabChangedListener(new OnTabChangeListener(){    
	            @Override  
	            public void onTabChanged(String tabId) {  
	                if (tabId.equals("tab1")) {   //第一个标签  
	                }  
	                if (tabId.equals("tab2")) {   //第二个标签  
	                }  
	                
	            }              
	        }); 
	}
}
