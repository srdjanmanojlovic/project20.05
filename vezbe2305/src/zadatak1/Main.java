package zadatak1;

import java.util.ArrayList;

//
//        Kreirati glavnu klasu I u njoj:
//        instancirati jednu planinu
//        napraviti nizili listu koji ce sadrzati najmanje tri rekrativna planinara I tri alpiniste
//        ispisati podatke o svim planinarima I za svakog od planinara ispisati da li ce se popeti
//        na instanciranu planin
//        ispisati kolika je zbir svih clanarina planinara iz niza/liste
public class Main {
    public static void main(String[] args) {
        Planina planina1 = new Planina("QA planina", "test drzava", 5220);
        Planinar planinar01 = new RekreativniPlaninar("111","Jova", "Jovic",
                10, "juznotesterski", 1000 );
        Planinar planinar02 = new RekreativniPlaninar("112","Pova", "Povic",
                20, "juznotesterski", 2000 );
        Planinar planinar03 = new RekreativniPlaninar("113","Kova", "Kovic",
                30, "juznotesterski", 3000 );

        Planinar planinar04 = new Alpinista("114", "Pera", "Peric", 5);
        Planinar planinar05 = new Alpinista("115", "Lera", "Leric", 15);
        Planinar planinar06 = new Alpinista("116", "Mera", "meric", 25);

        ArrayList<Planinar> planinari = new ArrayList<>();


        planinari.add(planinar01);
        planinari.add(planinar02);
        planinari.add(planinar03);
        planinari.add(planinar04);
        planinari.add(planinar05);
        planinari.add(planinar06);

        for (int i=0; i<planinari.size(); i++){
            System.out.println(planinari.get(i).toString());
            System.out.println(planinari.get(i).uspesanUspon(planina1));
        }
        double ukupnaClanarina=0;
        for (int i=0; i<planinari.size(); i++){
            ukupnaClanarina += planinari.get(i).clanarinaPlaninara();
        }
        System.out.println("Ukupna clanarina je " + ukupnaClanarina);

    }



}
