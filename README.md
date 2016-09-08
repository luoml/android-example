# android-example

## 1. ActivityLifeCycle
演示Activity生命周期。
参考
[《第一行代码》](http://blog.csdn.net/guolin_blog/article/details/26365913 "郭神's blog")第2章
<br>

本示例主要分为三个Activity：MainActivity（主活动，程序入口）、NormalActivity（普通活动）、DialogActivity（对话框式活动）。<br>

MainActivity包含两个按钮，点击按钮分别跳转至NormalActivity、DialogActivity，如下：<br>
![MainActivity](images/ActivityLifeCycle/main.jpg "MainActivity")

<br>
当首次启动，进入MainActivity主界面时，会依次执行MainActivity的onCreate() -> onStart() -> onResume()，日志如下：<br>
![首次启动，MainActivity日志输出](images/ActivityLifeCycle/1.jpg "首次启动，MainActivity日志输出")
<br>

此时，当点击Start Normal Activity时，将进入NormalActivity：<br>
![NormalActivity](images/ActivityLifeCycle/normal.jpg "NormalActivity")
<br>
由于NormalActivity将MainActivity完全遮挡住，因此onPause() -> onStop()都会执行，如下：<br>
![点击Start Normal Activity日志输出](images/ActivityLifeCycle/start_normal.jpg "点击Start Normal Activity日志输出")
<br>

当从NormalActivity点击Back按键返回时，由于之前的MainActivity已进入停止状态，所以会依次执行onRestart() -> onStart() -> onResume()，如下：<br>
![点击Back返回MainActivity日志输出](images/ActivityLifeCycle/normal_return.jpg "点击Back返回MainActivity日志输出")
<br>

然后，点击Start Dialog Activity时，启动DialogActivity：<br>
![DialogActivity](images/ActivityLifeCycle/dialog.jpg "DialogActivity")
<br>
由于DialogActivity并没有完全遮住MainActivity，此时MainActivity只是进入暂停状态，所以只执行了onPause()：<br>
![点击Start Dialog Activity日志输出](images/ActivityLifeCycle/start_dialog.jpg "点击Start Dialog Activity日志输出")
<br>

当由DialogActivity点击Back按键返回MainActivity主界面时，相应地只执行了onResume()：<br>
![点击Back返回MainActivity日志输出](images/ActivityLifeCycle/dialog_return.jpg "点击Back返回MainActivity日志输出")
<br>

最后，在MainActivity按下Back退回程序时，会依次执行onPause() -> onStop() -> onDestroy()，如下：<br>
![点击Back退出程序时日志输出](images/ActivityLifeCycle/back.jpg "点击Back退出程序时日志输出")
<br>
