package skin.support.design;

import android.content.Context;

import skin.support.SkinCompatManager;
import skin.support.design.app.SkinMaterialViewInflater;

/**
 * Created by ximsfei on 2017/1/13.
 */

public class SkinMaterialManager {
    public static void init(Context context) {
        SkinCompatManager.get(context).addInflater(new SkinMaterialViewInflater());
    }
}
