package com.lanyou.wyc.custompopwindow;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

/**
 * Created by wyc on 2017/5/12.
 */

public class CustomPopwindow {
    private Context context;
    private PopupWindow popupWindow;
    //默认宽高
    private int width = LinearLayout.LayoutParams.MATCH_PARENT;
    private int hight = LinearLayout.LayoutParams.WRAP_CONTENT;
    private View view;

    public CustomPopwindow(Context context) {
        this.context = context;
    }
    public CustomPopwindow setView(int resource){
        view = LayoutInflater.from(context).inflate(resource, null);
        popupWindow = new PopupWindow(view, width, hight);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                setBackgroundAlpha(1);
            }
        });

        return this;
    }
    public View getMenuView(){
        return view;
    }
    public CustomPopwindow setWidthAndHight(int width,int hight) {
        this.width = width;
        this.hight = hight;
        return this;
    }
    //是否获取焦点
    public CustomPopwindow setFocusable(boolean focusable){
        popupWindow.setFocusable(focusable);
        return this;
    }
    //点击外部区域是否关闭popupwindow
    public CustomPopwindow setOutsideTouchable(boolean touchable){
        popupWindow.setOutsideTouchable(touchable);
        popupWindow.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        return this;
    }

    public void dismiss(){
        if (popupWindow!=null && popupWindow.isShowing()) {
            popupWindow.dismiss();

        }
    }
    //设置背景透明度
    public CustomPopwindow setBackgroundAlpha(float alpha){
        WindowManager.LayoutParams lp = ((Activity)context).getWindow().getAttributes();
        lp.alpha = alpha;
        ((Activity)context).getWindow().setAttributes(lp);
        return this;
    }
    //设置进出动画
    public CustomPopwindow setAnimationStyle(int animationStyle){
        popupWindow.setAnimationStyle(animationStyle);
        return this;
    }
    public CustomPopwindow showAtLocation(View view,int gravity,int x,int y){
        popupWindow.showAtLocation(view,gravity,x,y);
        return this;
    }
    public CustomPopwindow showAsDropDown(View view){
        popupWindow.showAsDropDown(view);
        return this;
    }
    public CustomPopwindow showAsDropDown(View view,int xoff,int yoff){
        popupWindow.showAsDropDown(view,xoff,yoff);
        return this;
    }
    public CustomPopwindow showAsDropDown(View view,int xoff,int yoff,int gravity){
        popupWindow.showAsDropDown(view,xoff,yoff,gravity);
        return this;
    }
    public boolean isShowing(){
        return popupWindow.isShowing();
    }
}
