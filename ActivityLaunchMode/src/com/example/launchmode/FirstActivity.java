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
		Log.d(TAG, this.toString());
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		/**
		 * 测试默认启动模式[standard]
		 * 设置AndroidManifest.xml中FirstActivity活动的android:launchMode为"standard"（也可不设置，默认即为standard）
		 * 在FirstActivity中放置按钮，点击Button仍然跳转到FirstActivity
		 * 验证FirstActivity的实例是否会重复创建
		 */
		Button standardBtn = (Button) findViewById(R.id.firstBtn);
		standardBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//显示Intent传递活动
				Intent intent = new Intent(FirstActivity.this, FirstActivity.class);
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
	}
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onDestroy()
	 */
	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
}
