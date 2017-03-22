package com.ximsfei.skindemo.flycotablayout.ui;

import android.text.TextUtils;
import android.view.View;

import com.ximsfei.skindemo.R;

import skin.support.SkinCompatManager;
import skin.support.app.SkinCompatActivity;

/**
 * Created by pengfengwang on 2017/3/9.
 */

public class FlycoActivity extends SkinCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(SkinCompatManager.get(FlycoActivity.this).getCurSkinName())) {
                    SkinCompatManager.get(FlycoActivity.this).loadSkin("night.skin", null);
                } else {
                    SkinCompatManager.get(FlycoActivity.this).restoreDefaultTheme();
                }
            }
        });
    }
}
