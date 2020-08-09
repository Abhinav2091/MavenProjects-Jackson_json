package com.luv2code.samplePractice.challenges;

import java.util.LinkedList;

//cases
//string should be palindrome
//ignore punctuation in string
//ignore spaces
//ignore cases.
public class PalindromeStringUsingStack {

    public static void main(String ar[]) {

        System.out.println(checkForPalindrome("abccba"));//true
        System.out.println(checkForPalindrome("Was it a car or a cat i saw?"));//true
        System.out.println(checkForPalindrome("I did,did I?"));//true
        System.out.println(checkForPalindrome("hello"));//false
        System.out.println(checkForPalindrome("Don't nod"));//true

    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowercase = string.toLowerCase();
        for (int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }
        StringBuilder reversString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reversString.append(stack.pop());
        }
       /* System.out.println(stringNoPunctuation.toString());
        System.out.println(reversString.toString());*/
        return stringNoPunctuation.toString().equals(reversString.toString());
    }
}

