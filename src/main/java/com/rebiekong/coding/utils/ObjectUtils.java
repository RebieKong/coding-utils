package com.rebiekong.coding.utils;

import java.util.Arrays;

/**
 * @author RebieKong
 */
public class ObjectUtils {
    public static <T> void copyValue(T base, T upper) {
        Arrays.stream(base.getClass().getDeclaredFields()).forEachOrdered(field -> {
            boolean accessChange = false;
            if (field.isAccessible()) {
                field.setAccessible(true);
                accessChange = true;
            }
            try {
                Object v = field.get(upper);
                if(v != null){
                    field.set(base, field.get(upper));
                }
            } catch (IllegalAccessException ignored) {
            }
            if (accessChange) {
                field.setAccessible(false);
            }
        });
    }
}