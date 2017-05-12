# Popupwindow
仿IOS底部弹窗
 
使用方法：
  new CustomPopwindow(this).setView(R.layout.view_popupwindow)//设置popupwindow布局文件
                .setAnimationStyle(R.style.PopupWindow)//设置进出动画
                .setFocusable(true)//设置是否获取焦点
                .setOutsideTouchable(true)//设置点击外部区域是否关闭popupwindow
                .setBackgroundAlpha(0.7f)//设置显示popupwindow时窗口透明度
                .showAtLocation(view, Gravity.BOTTOM, 0, 0);//设置弹窗位置
