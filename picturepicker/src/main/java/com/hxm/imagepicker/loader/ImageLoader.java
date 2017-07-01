package com.hxm.imagepicker.loader;

import android.app.Activity;
import android.widget.ImageView;

import java.io.Serializable;

/**
 * 图片加载器
 * <p>
 * 修改时间：2017/07/01
 * 修改次数：第1次
 */
public interface ImageLoader extends Serializable {

    void displayImage(Activity activity, String path, ImageView imageView, int width, int height);

    void clearMemoryCache();
}
