package com.example.touch;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this,touch.class);
        startService(intent);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (KeyEvent.KEYCODE_D == keyCode)
            touch(110, 1230);
        if (KeyEvent.KEYCODE_F == keyCode)
            touch(277, 1230);
        if (KeyEvent.KEYCODE_J == keyCode)
            touch(493, 1230);
        if (KeyEvent.KEYCODE_K == keyCode)
            touch(627, 1230);


        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x, y;
        x = event.getX();
        y = event.getY();
        Log.e("x,y", x + "," + y);
        return super.onTouchEvent(event);
    }

    void touch(final int x, final int y) {
        new Thread(new Runnable() {
            @Override
            public void run() {


                new Instrumentation().sendPointerSync(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), MotionEvent.ACTION_DOWN, x, y, 0));
                Log.d("hellp", "jfeo");
                sleep a = new sleep(100);
                a.start();
                try {
                    a.join();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new Instrumentation().sendPointerSync(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), MotionEvent.ACTION_UP, x, y, 0));

            }


        }).start();
    }


}