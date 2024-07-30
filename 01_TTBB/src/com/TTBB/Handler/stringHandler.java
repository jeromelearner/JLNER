package com.TTBB.Handler;


public class stringHandler {
    //return a String with capitalized first letter
    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        // 将字符串转化为字符数组
        char[] charArray = str.toCharArray();

        // 确保首字母大写
        if (charArray[0] >= 'a' && charArray[0] <= 'z') {
            charArray[0] = (char) (charArray[0] - 'a' + 'A');
        }

        // 其余字母全部小写
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                charArray[i] = (char) (charArray[i] + 'a' - 'A');
            }
        }

        return new String(charArray);
    }

    //remove all the space (incluing tab, space, softreturn, etc.)
    public static String removeAllWhitespace(String str) {
        if (str == null) {
            return null;
        }
        // 使用正则表达式 \\s+ 删除所有空白字符
        return str.replaceAll("\\s+", "");
    }

    //check if all the characters are alphabetic a-zA-Z
    public static boolean containsNonAlphabeticCharacters(String str) {
        if (str == null) {
            return false;
        }
        // 使用正则表达式检查是否包含非大小写英文字符
        // [^a-zA-Z] 匹配任何非大小写英文字符
        return str.matches(".*[^a-zA-Z].*");
    }
}


