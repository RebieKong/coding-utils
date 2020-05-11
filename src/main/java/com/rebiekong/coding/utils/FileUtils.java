package com.rebiekong.coding.utils;

/**
 * @author RebieKong
 */
public class FileUtils {

    public static String getSuffix(String fileName) {
        int su = fileName.lastIndexOf(".");
        if (su == -1) {
            return "";
        } else {
            return fileName.substring(su+1);
        }
    }
}
