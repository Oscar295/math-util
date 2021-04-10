/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Admin
 */
public class MathUtility {
    //ham tinh n!= 1,2,3,...,n
    //0! = 1! = 1
    //am giai thua la no
    //long: max 18 con 0, 21! over kieu long -> 21 ko dc -> n input = 0-20.
    public static long getFactorial (int n){
        if(n<0||n>20)
            throw new IllegalArgumentException("Nahh. Do it again from 0 - 20 bruh");
        
        if(n==0 || n==1)
            return 1;
        return n * getFactorial(n-1); //xong de quy
    }   //con 1 cach khac, dung for nhan doi vao bien product = 1;
        //for 2..n, product = proudct * i;
}
