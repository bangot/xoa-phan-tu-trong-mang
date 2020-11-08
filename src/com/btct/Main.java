package com.btct;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n , i,c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap so phan tu vao mang");
            n = scanner.nextInt();

        }while (n<0);
        int arry[] =new int[n];
        for (i=0;i<n;i++){
            System.out.println("nhap phan tu thu " + i);
            arry[i]=scanner.nextInt();
        }
        for (i=0; i<n;i++){
            System.out.print(arry[ i ] +"\t");
        }
        System.out.println("nhap so nguyen h");
        int h=scanner.nextInt();
        for (c =i =0;i<n;i++){
            if (arry[i] !=h){
                arry[c]=arry[i];
                c++;

            }
        }System.out.println("mang con lai sau khi xoa");
        for (i=0;i<n;i++){
            System.out.print(arry[i] + "\t");
        }
    }
}
