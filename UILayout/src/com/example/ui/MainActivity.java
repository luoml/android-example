package com.example.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private EditText editText;

	private ImageView imgView;
	
	private ProgressBar progressBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		editText = (EditText) findViewById(R.id.editText);
		imgView = (ImageView) findViewById(R.id.imgView);
		progressBar = (ProgressBar) findViewById(R.id.progressBar);
		
		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		Button button3 = (Button) findViewById(R.id.button3);
		Button button4 = (Button) findViewById(R.id.button4);
		Button button5 = (Button) findViewById(R.id.button5);

		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		button5.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.button1:
				// 弹出EditText文本信息
				String editTxt = editText.getText().toString();
				Toast.makeText(MainActivity.this, editTxt, Toast.LENGTH_SHORT).show();
				break;
	
			case R.id.button2:
				// 替换ImageView图片
				imgView.setImageResource(R.drawable.img);
				break;
				
			case R.id.button3:
				if (progressBar.getVisibility() == View.INVISIBLE) {
					progressBar.setVisibility(View.VISIBLE);
					progressBar.setProgress(0);
				}
				
				// 测试进度条
				int progress = progressBar.getProgress();
				progress += 10;
				progressBar.setProgress(progress);
				if (progress >= 100) {
					progressBar.setVisibility(View.INVISIBLE);
				}
				break;
	
			case R.id.button4:
				// 测试警告对话框
				
				// 通过AlertDialog.Builder创建AlertDialog实例
				AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
				
				dialog.setTitle("title"); //设置标题
				dialog.setMessage("alert message"); //设置内容
				dialog.setCancelable(false); //设置可否取消，设置为false表示不能通过Back键取消
				
				// 设置确定按钮的点击事件
				dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_SHORT).show();
					}
				});
				
				// 设置取消按钮的点击事件
				dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(MainActivity.this, "cancel", Toast.LENGTH_SHORT).show();
					}
				});
				
				// 显示对话框
				dialog.show();
				break;
			
			case R.id.button5:
				// 测试ProgressDialog，类似AlertDialog
				ProgressDialog proDialog = new ProgressDialog(MainActivity.this);
				proDialog.setTitle("title");
				proDialog.setMessage("progress message");
				proDialog.setCancelable(true);
				proDialog.show();
				
				break;
				
			default:
				break;
		}
	}
}
