package skin.support.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ximsfei on 2017/1/10.
 */

public class SkinCompatPref {
    private static final String FILE_NAME = "-skin-pref";

    public static final String KEY_SKIN_NAME = "skin-name";
    private static SkinCompatPref sInstance;
    private final Context mApp;
    private final SharedPreferences mPref;
    private final SharedPreferences.Editor mEditor;

//    public static void init(Context context) {
//        if (sInstance == null) {
//            synchronized (SkinPreference.class) {
//                if (sInstance == null) {
//                    sInstance = new SkinPreference(context.getApplicationContext());
//                }
//            }
//        }
//    }

//    public static SkinPreference getInstance() {
//        return sInstance;
//    }

    public SkinCompatPref(Context applicationContext) {
        mApp = applicationContext;
        mPref = mApp.getSharedPreferences(mApp.getPackageName() + FILE_NAME, Context.MODE_PRIVATE);
        mEditor = mPref.edit();
    }

    public SkinCompatPref setSkinName(String skinName) {
        mEditor.putString(KEY_SKIN_NAME, skinName);
        return this;
    }

    public String getSkinName() {
        return mPref.getString(KEY_SKIN_NAME, "");
    }

    public void commitEditor() {
        mEditor.apply();
    }
}
