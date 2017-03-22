package com.ximsfei.skin_autolayout_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;

import skin.support.SkinCompatManager;
import skin.support.app.SkinCompatActivity;

/**
 * Created by pengfengwang on 2017/3/15.
 */

public class MainActivity extends SkinCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(SkinCompatManager.get(MainActivity.this).getCurSkinName())) {
                    SkinCompatManager.get(MainActivity.this).loadSkin("night.skin", null);
                } else {
                    SkinCompatManager.get(MainActivity.this).restoreDefaultTheme();
                }
            }
        });
    }
}
