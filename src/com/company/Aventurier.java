package com.company;

import java.util.Random;
import java.util.Scanner;

public class Aventurier {

    public static void main(String[] args) {
            Random C = new Random();
            int essai =0;

            int justprix = C.nextInt(200);
            int prix =0;
            while (justprix !=prix){
                System.out.println("entre un numero entre 0 et 200");
                Scanner scan = new Scanner(System.in);
                if( justprix > prix){
                    System.out.println(" c'est plus ");
                }else{
                    System.out.println("c'est moins");
                }
                prix = scan.nextInt();

                essai++;


            }
            System.out.println(" bravo : le just prix :" + justprix);
            System.out.println(" en plus " + essai + " essai");
        }
    }


