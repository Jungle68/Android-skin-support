package skin.support.flycotablayout;

import android.content.Context;

import skin.support.SkinCompatManager;
import skin.support.flycotablayout.app.SkinFlycoTabLayoutInflater;

/**
 * Created by ximsf on 2017/3/8.
 */

public class SkinFlycoTabLayoutManager {
    public static void init(Context context) {
        SkinCompatManager.get(context).addInflater(new SkinFlycoTabLayoutInflater());
    }
}
