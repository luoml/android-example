/**
 * @Title MainActivity.java
 * @Package com.example.activity
 * @Description Activity Create/LifeCycle、Log
 * @author ml_luo@126.com
 * @date 2016-9-4
 * @version V1.0
 */
package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Log.v() [verbose] < Log.v() [debug] < Log.i() [info] < Log.w() [warn] < Log.e() [error]
 * 
 * @ClassName MainActivity
 * @Description 测试Activity
 * @author ml_luo@126.com
 * @date 2016-9-4
 */
public class MainActivity extends Activity {

	private static String TAG = "MainActivity";

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v(TAG, "onCreate");

		setContentView(R.layout.layout_main);

		Button normalBtn = (Button) findViewById(R.id.normalId);
		normalBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// 使用显示Intent启动活动
				// 当在内部类中使用this指的就是内部类的对象，为了访问外层类对象，就必须使用外层类名.this
				// Intent(Context packageContext, Class<?> cls)
				// packageContext启动活动的上下文，cls指定想要启动的目标活动
				Intent intent = new Intent(MainActivity.this, NormalActivity.class);
				startActivity(intent); // 启动活动
			}
		});

		Button dialogBtn = (Button) findViewById(R.id.dialogId);
		dialogBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, DialogActivity.class);
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
		Log.v(TAG, "onStart");
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onResume()
	 */
	@Override
	protected void onResume() {
		super.onResume();
		Log.v(TAG, "onResume");
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		super.onPause();
		Log.v(TAG, "onPause");
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onStop()
	 */
	@Override
	protected void onStop() {
		super.onStop();
		Log.v(TAG, "onStop");
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onRestart()
	 */
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.v(TAG, "onRestart");
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onDestroy()
	 */
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.v(TAG, "onDestroy");
	}
}
