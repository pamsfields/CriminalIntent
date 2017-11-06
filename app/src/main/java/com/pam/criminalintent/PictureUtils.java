package com.pam.criminalintent;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;

/**
 * Created by Pam on 10/17/2017.
 */

public class PictureUtils {
    public static Bitmap getScaledBitmap(String path, Activity activity){
        Point size = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(size);

        return getScaledBitmap(path, activity);
    }
}
