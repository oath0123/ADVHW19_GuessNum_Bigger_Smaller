package com.example.lib;

import java.util.Random;
import java.util.Scanner;

public class GamePlay {
    int rnd[];
    String ans;
    Boolean playFlag=true,guessWrong=false;
    Scanner scanner=new Scanner(System.in);

    public void Play(){
        rnd=new int[5];
System.out.println("請嘗試連續猜對五次答案\n");
     while (playFlag){
         for (int i=0;i<5;i++){
             Random random = new Random(System.currentTimeMillis());
             rnd[i] = random.nextInt(14) + 1;
            while (rnd[i]==7){
                rnd[i] = random.nextInt(14) + 1;
            }

             System.out.println("請猜第"+(i+1)+"個答案，比7大回答是，反之，則答否:");
             ans=scanner.next();
             if(ans.equals("是") && rnd[i]<7){
                 playFlag=false;
                 guessWrong=true;
                 break;
             }
             else if(ans.equals("否") && rnd[i]>7){
                 playFlag=false;
                 guessWrong=true;
                 break;
             }
             else if(ans.equals("是")&&rnd[i]>7){
                 System.out.println("你答對此題");
             }
             else if(ans.equals("否")&&rnd[i]<7){
                 System.out.println("你答對此題");
             }
         }
         if(guessWrong==true){
             System.out.println("你失敗了!");
         }
         else {
             System.out.println("你過關了!");
         }
     }

    }
}
