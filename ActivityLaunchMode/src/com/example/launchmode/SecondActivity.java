/**
 * @Title SecondActivity.java
 * @Package com.example.launchmode
 * @Description 注册为普通活动，配合测试singleTop、
 * @author ml_luo@126.com
 * @date 2016-9-11
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
 * @ClassName SecondActivity
 * @Description 测试singleTop
 * @author ml_luo@126.com
 * @date 2016-9-11
 */
public class SecondActivity extends Activity {

	private static final String TAG = "SecondActivity";

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		Log.i(TAG, this.toString());
		
		Button rtnFirstBtn = (Button) findViewById(R.id.rtnFirstBtn);
		rtnFirstBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
				startActivity(intent);
			}
		});
	}
}
