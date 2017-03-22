package skin.support;

import android.content.Context;

import skin.support.app.SkinCardViewInflater;

/**
 * Created by ximsfei on 2017/3/5.
 */

public class SkinCardViewManager {
    public static void init(Context context) {
        SkinCompatManager.get(context).addInflater(new SkinCardViewInflater());
    }
}
