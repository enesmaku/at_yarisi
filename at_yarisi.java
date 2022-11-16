/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author sasni
 */
public class kosatkos {
    public static void main(String[] args) throws InterruptedException{
        int at1=0,at2=0,at3=0,at4=0;
        while(true){
           System.out.print("\033[H\033[2J");  
System.out.flush();  
            at1+=(int) ((Math.random() * (12 - 1)) + 1);
            at2+=(int) ((Math.random() * (12 - 1)) + 1);
            at3+=(int) ((Math.random() * (12 - 1)) + 1);
            at4+=(int) ((Math.random() * (12 - 1)) + 1);
            System.out.println();
             System.out.println();
            System.out.print("AT 1 : ");
            for (int i = 0; i < at1; i++) {
                System.out.print(" ");
            }
            System.out.println("~O");
            System.out.print("AT 2 : ");
            for (int i = 0; i < at2; i++) {
                System.out.print(" ");
            }
            System.out.println("~O");
            System.out.print("AT 3 : ");
            for (int i = 0; i < at3; i++) {
                System.out.print(" ");
            }
           System.out.println("~O");
            System.out.print("AT 4 : ");
            for (int i = 0; i < at4; i++) {
                System.out.print(" ");
            }
            System.out.println("~O");
             System.out.println();
            System.out.println(at1+" "+at2+" "+at3+" "+at4);
            if(at1>=200){
                System.out.println("AT 1 KAZANDI!");
                break;
            }
            if(at2>=200){
                System.out.println("AT 2 KAZANDI!");
                break;
            }
            if(at3>=200){
                System.out.println("AT 3 KAZANDI!");
                break;
            }
            if(at4>=200){
                System.out.println("AT 4 KAZANDI!");
                break;
            }
             Thread.sleep(500);
        }
    }
}
