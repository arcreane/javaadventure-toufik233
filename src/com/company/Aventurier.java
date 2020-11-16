package com.company;

public class Aventurier {
  int pointdevie;


    public Aventurier() {
        pointdevie = 200;

    }
    public void perde ( int domage){
        pointdevie -= domage;
    }
}