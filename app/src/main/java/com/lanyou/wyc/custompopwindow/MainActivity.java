package com.lanyou.wyc.custompopwindow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView cancel;
    private TextView menu1;
    private TextView menu2;
    private CustomPopwindow popwindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnOnClick(View view) {
        showPopupwindow(view);
    }

    private void showPopupwindow(View view) {
        if (popwindow!=null && popwindow.isShowing()){
            return;
        }
        popwindow = new CustomPopwindow(this).setView(R.layout.view_popupwindow)
                .setAnimationStyle(R.style.PopupWindow)
                .setFocusable(true)
                .setOutsideTouchable(true)
                .setBackgroundAlpha(0.7f)
                .showAtLocation(view, Gravity.BOTTOM, 0, 0);
        View menuView = popwindow.getMenuView();
        cancel = (TextView) menuView.findViewById(R.id.tv_cancel);
        menu1 = (TextView) menuView.findViewById(R.id.tv_pick_phone);
        menu2 = (TextView) menuView.findViewById(R.id.tv_pick_zone);
        cancel.setOnClickListener(this);
        menu1.setOnClickListener(this);
        menu2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_cancel:
                Toast.makeText(this,"点击了取消",Toast.LENGTH_SHORT).show();
                popwindow.dismiss();
                break;
            case R.id.tv_pick_phone:
                Toast.makeText(this,"点击了menu1",Toast.LENGTH_SHORT).show();
                popwindow.dismiss();
                break;
            case R.id.tv_pick_zone:
                Toast.makeText(this,"点击了menu2",Toast.LENGTH_SHORT).show();
                popwindow.dismiss();
                break;
        }
    }


}
