/**
 * @Title FirstActivity.java
 * @Package com.example.launchmode
 * @Description 测试活动的启动模式：standard、singleTop、 singleTask、singleInstance
 * @author ml_luo@126.com
 * @date 2016-9-10
 * @version V1.0
 */
package com.example.launchmode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @ClassName FirstActivity
 * @Description 测试活动的启动模式：standard、singleTop、 singleTask、singleInstance
 * @author ml_luo@126.com
 * @date 2016-9-10
 */
public class FirstActivity extends Activity {
	
	private static final String TAG = "FirstActivity";

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		Log.i(TAG, this.toString());
		Log.w(TAG, "Task id is " + getTaskId());
		
		/**
		 * 点击firstBtn仍然跳转到FirstActivity，验证FirstActivity的实例是否会重复创建
		 * 配置AndroidManifest.xml中FirstActivity活动的启动模式
		 * 
		 * 当android:launchMode="standard"（也可不设置，默认即为standard），测试默认启动模式
		 * 当android:launchMode="singleTop"，测试singleTop模式
		 * 
		 * 可以发现，当standard模式启动时，点击几次就会有几个FirstActivity实例
		 * 而当singleTop模式启动时，不管点击多少次都只会有一个FirstActivity实例
		 */
		Button defaultBtn = (Button) findViewById(R.id.defaultBtn);
		defaultBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//显示Intent传递活动
				Intent intent = new Intent(FirstActivity.this, FirstActivity.class);
				startActivity(intent);
			}
		});
		
		/**
		 * 点击topBtn跳转到SecondActivity，验证FirstActivity的实例是否会重复创建
		 * 配置AndroidManifest.xml中FirstActivity活动的启动模式为singleTop
		 */
		Button topBtn = (Button) findViewById(R.id.topBtn);
		topBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//显示Intent传递活动
				Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
				startActivity(intent);
			}
		});
		
		/**
		 * 点击taskBtn跳转到SecondActivity，验证singleTask启动模式
		 * 配置AndroidManifest.xml中FirstActivity活动的启动模式为singleTask
		 */
		Button taskBtn = (Button) findViewById(R.id.taskBtn);
		taskBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//显示Intent传递活动
				Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
				startActivity(intent);
			}
		});
		
		/**
		 * singleInstance
		 */
		Button instanceBtn = (Button) findViewById(R.id.instanceBtn);
		instanceBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//显示Intent传递活动
				Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
				startActivity(intent);
			}
		});
		
	}
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onStart()
	 */
	@Override
	protected void onStart() {
		super.onStart();
	}
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onResume()
	 */
	@Override
	protected void onResume() {
		super.onResume();
	}
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		super.onPause();
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onStop()
	 */
	@Override
	protected void onStop() {
		super.onStop();
	}
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onRestart()
	 */
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i(TAG, "onRestart");
	}
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onDestroy()
	 */
	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
}
