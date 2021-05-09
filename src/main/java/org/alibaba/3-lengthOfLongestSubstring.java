package org.alibaba;

import java.util.ArrayList;
import java.util.List;

class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        List<Character> cache = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            while (cache.contains(s.charAt(i)) && (cache.size() > 0)) {
                cache.remove(0);
            }
            cache.add(s.charAt(i));
            maxLength = maxLength > cache.size() ? maxLength : cache.size();
        }
        return maxLength;
    }
}
