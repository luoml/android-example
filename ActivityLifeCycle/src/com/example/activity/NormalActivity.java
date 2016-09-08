/**
 * @Title NormalActivity.java
 * @Package com.example.activity
 * @Description 普通活动，用于测试Activity生命周期
 * @author ml_luo@126.com
 * @date 2016-9-7
 * @version V1.0
 */
package com.example.activity;

import android.app.Activity;
import android.os.Bundle;

/**
 * @ClassName NormalActivity
 * @Description 普通活动，测试Activity生命周期
 * @author ml_luo@126.com
 * @date 2016-9-7
 * 
 */
public class NormalActivity extends Activity {
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_normal);
	}
}
