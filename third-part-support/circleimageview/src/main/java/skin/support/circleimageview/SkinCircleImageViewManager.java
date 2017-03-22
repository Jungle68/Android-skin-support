package skin.support.circleimageview;

import android.content.Context;

import skin.support.SkinCompatManager;
import skin.support.circleimageview.app.SkinCircleImageViewInflater;

/**
 * Created by ximsfei on 2017/3/5.
 */

public class SkinCircleImageViewManager {
    public static void init(Context context) {
        SkinCompatManager.get(context).addInflater(new SkinCircleImageViewInflater());
    }
}
