/**
 * @Title ThirdActivity.java
 * @Package com.example.launchmode
 * @Description 注册为普通活动，配合测试singleInstance
 * @author ml_luo@126.com
 * @date 2016-10-10
 * @version V1.0
 */
package com.example.launchmode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * @ClassName ThirdActivity
 * @Description 注册为普通活动，配合测试singleInstance
 * @author ml_luo@126.com
 * @date 2016-10-10
 */
public class ThirdActivity extends Activity {
	private static final String TAG = "ThirdActivity";

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.i(TAG, this.toString());
		Log.w(TAG, "Task id is " + getTaskId());
		setContentView(R.layout.activity_third);
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
