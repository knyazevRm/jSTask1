package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 3 (dnm)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        int size = 1;
        int start = 0;
        int finish = 0;
        boolean flag = false;
        char[] arr = checkString.toCharArray();
        if (arr.length == 0) {
            return 0;
        }
        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] != arr[i]) {
                flag = true;
            } else {
                flag = false;
            }

            if (!flag) {
                start = i;
            }
            finish = i;

            for (int j = start; j < finish && flag; j++) {
                if (arr[finish] == arr[j]) {
                    flag = false;
                    start = j + 1;
                }
            }

            if (size < finish - start + 1 && flag) {
                size = finish - start + 1;
            }
        }
        return size;
    }
}
