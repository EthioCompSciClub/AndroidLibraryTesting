package club.science.computer.ethiopian.androidlibrary;

import android.util.Log;

/**
 * Created by User on 7/1/2017.
 */

public class LogDebug {
    private static final String TAG = "SUPER_LOG";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
