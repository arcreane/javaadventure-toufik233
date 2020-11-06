package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Aventurier();
        System.out.println("Trésor");
        Random C = new Random();
        int essai = C.nextInt(10);
        boolean batom1tf = false;
        String batom1 = "batom orginal ";
        // games
        int bois = 0;
        int attack = 1;
        int life = 10;
        int lifeplayer = 10;
        int enemeylife = 15;
        int fight = 0;
        // points
        int point = 0;
        int point2 = 5;
        int point3 = 10;
        int pointmax = 3;

        while (attack != lifeplayer) {
            System.out.println("angelique");
            Scanner scan = new Scanner(System.in);
            if( life < attack ){
                System.out.println(" tu es mort ");
            }else{
                System.out.println(" ");
            }
            pointmax= scan.nextInt();

            essai++;


        }
    }
}

