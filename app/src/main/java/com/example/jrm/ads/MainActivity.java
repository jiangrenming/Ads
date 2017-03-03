package com.example.jrm.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private PopupWindow popupWindow;
    private View contentView;
    private boolean isVisable = true;
    private TextView colock;
    private int TimeCache;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   /* @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (popupWindow == null || !popupWindow.isShowing() && isVisable){
            showPopupWindow();
        }
    }*/

    /*private void showPopupWindow() {
        TimeCache = 3;
        LayoutInflater mInflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
        contentView = mInflater.inflate(R.layout.activity_startpage, null);
        popupWindow = new PopupWindow(contentView, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT,true);
        popupWindow.setTouchable(true);
        //popupWindow.setOutsideTouchable(true);
        LinearLayout skipClock = (LinearLayout) contentView.findViewById(R.id.skipColock);
        colock = (TextView) contentView.findViewById(R.id.clock);
        skipClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (popupWindow.isShowing()){
                    popupWindow.dismiss();
                    isVisable = false;
                }
            }
        });
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.showAtLocation(findViewById(R.id.activity_main), Gravity.BOTTOM|Gravity.CENTER,0,0);
        popupWindow.update();
        new MyShareTask(colock,TimeCache).execute(); //倒计时的开始
        //后退键的监听
        contentView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_BACK)
                    popupWindow.dismiss();
                    isVisable = false;
                return false;
            }
        });*/

   // }

   /* *//**
     * 计算倒计时
     *//*
    class MyShareTask extends AsyncTask<Void, Void, Boolean> {
        TextView timeView;
        int limit_time = 0;
        MyShareTask(TextView timeView, int time){
            this.timeView = timeView;
            this.limit_time = time;
        }
        @Override
        protected Boolean doInBackground(Void... params) {
            while(limit_time >= 0){
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        timeView.setText( limit_time+"");
                    }
                });
                SystemClock.sleep(1000);
                limit_time--;
                if (limit_time == 0){
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if (popupWindow.isShowing()){
                                popupWindow.dismiss();
                                isVisable = false;
                            }
                        }
                    });
                }
            }
            return null;
        }
    }*/
}
