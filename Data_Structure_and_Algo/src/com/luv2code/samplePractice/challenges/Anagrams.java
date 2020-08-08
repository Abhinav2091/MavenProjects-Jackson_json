package com.luv2code.samplePractice.challenges;

import java.util.Scanner;

public class Anagrams {

        int c = 0;

        void input()throws Exception
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a word : ");
            String inputString = sc.next();
            System.out.println("The Anagrams are : ");
            display("",inputString);
            System.out.println("Total Number of Anagrams = "+c);
        }

        void display(String blankString, String inputString)
        {
            if(inputString.length()<=1)
            {
                c++;
                System.out.println(blankString+inputString);
            }
            else
            {
                for(int i=0; i<inputString.length(); i++)
                {
                    String x = inputString.substring(i, i+1);
                    String y = inputString.substring(0, i);
                    String z = inputString.substring(i+1);
                    display(blankString+x, y+z);
                }
            }
        }

        public static void main(String args[])throws Exception
        {
            Anagrams ob=new Anagrams();
            ob.input();
        }
    }

