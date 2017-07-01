package com.lzy.imagepicker.util;

import android.content.Context;

/**
 * 用于解决provider冲突的util
 * <p>
 * 修改时间：2017/07/01
 * 修改次数：第1次
 */
public class ProviderUtil {

    public static String getFileProviderName(Context context) {
        return context.getPackageName() + ".provider";
    }
}
