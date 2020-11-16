package com.company;

public class Pieces {
    Monstre toto;


    Pieces() {
        toto = new Monstre();


    }

    public void parcours(Aventurier hero) {
        toto.attack(hero);

    }
}
