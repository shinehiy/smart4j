package org.smart4j.chapter2.util;

/**
 * Created by abc on 2017/9/13.
 */
public final class StringUtil {
    public static boolean isEmpty(String str) {
        if(str != null) {
            str = str.trim();
        }
        return StringUtil.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
