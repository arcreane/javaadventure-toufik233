package com.company;

public class Monstre {
    int pointVie;
    Armes flech;
    Monstre (){
        pointVie = 10;
        flech = new Armes();

    }

    public void attack(Aventurier hero) {
        hero.perde(flech.domage);
    }
}

