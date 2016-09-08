/**
 * @Title DialogActivity.java
 * @Package com.example.activity
 * @Description 对话框式活动，用于测试Activity生命周期
 * @author ml_luo@126.com
 * @date 2016-9-7
 * @version V1.0
 */
package com.example.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * @ClassName DialogActivity
 * @Description 对话框式活动，测试Activity生命周期
 * @author ml_luo@126.com
 * @date 2016-9-7
 *
 */
public class DialogActivity extends Activity {

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);	//隐藏标题栏
		setContentView(R.layout.layout_dialog);
	}

}
