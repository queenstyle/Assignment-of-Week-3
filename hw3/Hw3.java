/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author fsa
 */
public class Hw3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        String word = new String();
        String s = new String();
        int count = 0;
        int choose = 0;
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap();//加入特定型態
        FileReader file = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(file);
        while (br.ready()) {//ready=讀取一個字串
            word = br.readLine();
            count = Integer.valueOf(br.readLine());//字串轉整數
            hashMap.put(word, count);
        }
        file.close();
        while (true) {
            System.out.println("1)輸入2)搜尋 -1)exit:");
            choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("請輸入一行英文句子：");
                while ((s = sc.nextLine()).equals("")) ;
                s = s.toLowerCase();
                String[] afterSplit = s.split(",|\\.|\\!|\\?|\\ |\\. |\\(|\\)|;");
                for (int i = 0; i < afterSplit.length; i++) {
                    if (hashMap.get(afterSplit[i]) == null) {//第一次
                        hashMap.put(afterSplit[i], 1);
                    } else {
                        hashMap.put(afterSplit[i], hashMap.get(afterSplit[i]) + 1);
                    }
                }
            } else if (choose == 2) {
                System.out.println("請輸入想搜尋的字符：");
                while ((s = sc.nextLine()).equals("")) ;
                if (hashMap.get(s) == null) {//沒有
                    System.out.println("無此字符");
                } else {
                    System.out.println(s + "=" + hashMap.get(s));
                }
            } else {
                FileWriter fw = new FileWriter("test.txt");
                for (Object key : hashMap.keySet()) {
                    fw.write(key + "\n" + hashMap.get(key) + "\r\n");
                }
                fw.flush();
                fw.close();
                break;
            }
        }
        //寫檔
    }

}
