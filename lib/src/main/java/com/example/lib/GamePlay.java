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
System.out.println("�й��ճs��q�來������\n");
     while (playFlag){
         for (int i=0;i<5;i++){
             Random random = new Random(System.currentTimeMillis());
             rnd[i] = random.nextInt(14) + 1;
            while (rnd[i]==7){
                rnd[i] = random.nextInt(14) + 1;
            }

             System.out.println("�вq��"+(i+1)+"�ӵ��סA��7�j�^���O�A�Ϥ��A�h���_:");
             ans=scanner.next();
             if(ans.equals("�O") && rnd[i]<7){
                 playFlag=false;
                 guessWrong=true;
                 break;
             }
             else if(ans.equals("�_") && rnd[i]>7){
                 playFlag=false;
                 guessWrong=true;
                 break;
             }
             else if(ans.equals("�O")&&rnd[i]>7){
                 System.out.println("�A���惡�D");
             }
             else if(ans.equals("�_")&&rnd[i]<7){
                 System.out.println("�A���惡�D");
             }
         }
         if(guessWrong==true){
             System.out.println("�A���ѤF!");
         }
         else {
             System.out.println("�A�L���F!");
         }
     }

    }
}
