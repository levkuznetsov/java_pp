package lev.numberanalyzeservice.utils;

public class NumberUtils {

    public boolean isCreatable(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        char[] chars = str.toCharArray();
        int startNum = 0;
        boolean hasPoint = false;

        if (chars[0] == '-') {
            if (chars.length == 1) {
                return false;
            }
            startNum = 1;
        }

        for (int i = startNum; i < chars.length; i++) {
            char c = chars[i];

            if (c == '.') {
                if (hasPoint) {
                    return false;
                }
                hasPoint = true;
                if (i == startNum || i == chars.length - 1) {
                    return false;
                }
                continue;
            }
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
