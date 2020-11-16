package com.company;


public  class Donjon {
    Pieces[] donjon;
    public Donjon (){
        donjon= new Pieces[5];
        for (int i = 0; i < donjon.length ; i++) {
            donjon[i] = new Pieces();

        }
    }
    public static void main(String[] args) {
        Donjon mondongon = new Donjon();
        Aventurier hero = new Aventurier();
        mondongon.accepte(hero);
    }

    private void accepte(Aventurier hero) {
        for (int i = 0; i < donjon.length ; i++) {
            donjon[i].parcours(hero);


        }

    }


    protected String afficherTypeAttacker(int calculePointVie){
        String type="type inconnu";
        switch (calculePointVie) {
            case 10:
                type="magiciens";
                break;
            case 9:
                type="barbares";
                break;
            case 5:
                type="aventuirer";
                break;
            default:
                break;

        }


        return type;
    }

}


