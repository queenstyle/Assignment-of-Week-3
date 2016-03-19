/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author fsa
 */
public class Hw2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String find = new String();
        String sname = new String();
        int num = 0, a = 0;
        HashMap hashMap = new HashMap();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("請輸入學生姓名:(-1:exit");
            sname = sc.next();

            if (sname.equals("-1") == true) {
                break;
            }
            System.out.println("請輸入學生成績:");
            num = sc.nextInt();
            hashMap.put(sname, num);
        }

        System.out.println("請輸入搜尋的學生姓名:");
        find = sc.next();
        if (hashMap.get(find) == null) {
            System.out.println("沒有這個學生!");
        } else {
            System.out.println("學生" + find + "成績=" + hashMap.get(find));
        }
    }
}
