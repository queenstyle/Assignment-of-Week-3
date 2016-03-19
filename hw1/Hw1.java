/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author fsa
 */
public class Hw1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string = new String();
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一行英文句子：");
        string = sc.nextLine();
        String[] afterSplit = string.split(",|\\.|\\!|\\?|\\ |\\. |\\(|\\)|;");
        ArrayList<String> save = new ArrayList<>();
        for (int i = 0; i < afterSplit.length; i++) {
            afterSplit[i] = afterSplit[i].toLowerCase();
            try {
              //  System.out.println(Integer.parseInt(afterSplit[i]));
                sum += Integer.parseInt(afterSplit[i]);
            } catch (NumberFormatException e) {
                save.add(afterSplit[i]);
            }
        }
        System.out.println("字串分割:");
         for (int i = 0; i < save.size(); i++) { 
             if(save.equals(" ") == true)
                 ;
             else
                System.out.println(save.get(i)); 
        }
          System.out.println("數字總和:");
           System.out.println(sum);
    }
}
