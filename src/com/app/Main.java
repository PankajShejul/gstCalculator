package com.app;

import java.util.Scanner;

public class Main {

    public static double totalSum(int category,int quantity,int price){
      if(category==1)
      {
        return quantity*price;
      }else{
        return ((quantity*price)+(0.05*(quantity*price)));
      }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        double bill=0;
        while(flag){
          System.out.println("1.Shop");
          System.out.println("2.Bill");
          switch(sc.nextInt())
          {
            case 1:
              System.out.println("Enter Quantity");
              int quantity=sc.nextInt();
              System.out.println("Enter Category(Food=1 & Furniture=2)");
              int category=sc.nextInt();
              System.out.println("Enter Name");
              String name=sc.next();
              System.out.println("Enter Price:");
              int price=sc.nextInt();
              bill=bill+totalSum(category,quantity, price);
              break;
            case 2:
              System.out.println("Your bill is"+bill);
              flag=false;
              break;
            default:
              System.out.println("Please Enter Correct Input:");
              break;
          }
        }





    }
}
