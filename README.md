# Popupwindow
仿IOS底部弹窗
 
使用方法：
  new CustomPopwindow(context)
                //设置popupwindow布局文件
                .setView(R.layout.view_popupwindow)
                //设置进出动画
                .setAnimationStyle(R.style.PopupWindow)
                //设置是否获取焦点
                .setFocusable(true)
                //设置点击外部区域是否关闭popupwindow
                .setOutsideTouchable(true)
                //设置显示popupwindow时窗口透明度
                .setBackgroundAlpha(0.7f)
                //设置弹窗位置
                .showAtLocation(view, Gravity.BOTTOM, 0, 0);
