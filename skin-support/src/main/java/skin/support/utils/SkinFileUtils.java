package skin.support.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Environment;

import java.io.File;

/**
 * Created by ximsfei on 17-1-10.
 */

public class SkinFileUtils {
    public static String getSkinDir(Context context) {
        File skinDir = new File(getDir(context), context.getPackageName());
        if (!skinDir.exists()) {
            skinDir.mkdirs();
        }
        return skinDir.getAbsolutePath();
    }

    public static String getDir(Context context) {
        boolean debug = (context.getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        if (debug && Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            File dir = context.getExternalFilesDir(SkinConstants.SKIN_DEPLOY_PATH);
            if (dir != null && (dir.exists() || dir.mkdirs())) {
                return dir.getAbsolutePath();
            }
        }

        return context.getDir(SkinConstants.SKIN_DEPLOY_PATH, 0).getAbsolutePath();
    }

}
