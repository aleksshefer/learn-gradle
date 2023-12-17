package ru.shefer;

import org.apache.commons.lang3.StringUtils;
import ru.shefer.customStringUtils.CustomStringUtils;

public class Main {
    public static void main(String[] args) {
        String text = "Hello World!";

        String reversed = StringUtils.reverse(text);
        System.out.println(text);
        System.out.println(reversed);
        CustomStringUtils customStringUtils = new CustomStringUtils();
        System.out.println(customStringUtils.reverseString(text));
    }
}