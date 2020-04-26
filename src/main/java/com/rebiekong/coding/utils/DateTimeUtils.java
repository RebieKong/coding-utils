package com.rebiekong.coding.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author RebieKong
 */
public class DateTimeUtils {

    /**
     * 获取特定格式日期
     *
     * @param format 日期格式
     * @see SimpleDateFormat
     * @return 格式化字符串
     */
    public static String getDateString(String format) {
        return new SimpleDateFormat(format).format(new Date(System.currentTimeMillis()));
    }

}
