package com.example.touch;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Toast;

public class touch extends AccessibilityService {

    @Override
    public void onCreate() {
        Log.e("is on create","is on create");
        super.onCreate();
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Toast.makeText(this,"test",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onInterrupt() {

    }

    @Override
    protected boolean onKeyEvent(KeyEvent event) {
        Toast.makeText(this,"key press",Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    protected void onServiceConnected() {

    }
}
