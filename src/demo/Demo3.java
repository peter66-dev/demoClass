/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import library.MyLibrary;
import static java.lang.System.out;
/**
 *
 * @author Dell
 */
public class Demo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        a = 3;
        b = 5;
        int result1 = MyLibrary.Sum(a, b);
        System.out.println(result1);
        out.print(a);
    }

}
