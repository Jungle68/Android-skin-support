package skin.support;

import android.content.Context;

import skin.support.app.SkinHookAutoLayoutViewInflater;

/**
 * Created by pengfengwang on 2017/3/15.
 */

public class SkinHookAutoLayoutManager {
    public static void init(Context context) {
        SkinCompatManager.get(context).addHookInflater(new SkinHookAutoLayoutViewInflater());
    }
}
