package Zadatak1;
//Napraviti klasu Obrok koja ima kao atribut listu sastojaka od kojih se obrok
//        sastoji i metodu racunajKalorije().Obrok može
////        biti zdrav ili nezdrav.Metoda racunajKalorije() treba da se izvršava tako da u
////        zdravom obroku sabere sve kalorije obroka i prikaže ih korisniku sa porukom
////        „Hranite se zdravo, uneli ste X kalorija“, a ako je u pitanju nezdrav obrok da
////        prikaže poruku „Ne hranite se zdravo, uneli ste X kalorija“
import java.util.ArrayList;

public class Obrok {
    private ArrayList<Sastojak> sastojci;
    private VrstaObroka vrstaObroka;

    public Obrok() {
    }

    public Obrok(ArrayList<Sastojak> sastojci, VrstaObroka vrstaObroka) {
        this.sastojci = sastojci;
        this.vrstaObroka = vrstaObroka;
    }

    public ArrayList<Sastojak> getSastojci() {
        return sastojci;
    }

    public void setSastojci(ArrayList<Sastojak> sastojci) {
        this.sastojci = sastojci;
    }

    public VrstaObroka getVrstaObroka() {
        return vrstaObroka;
    }

    public void setVrstaObroka(VrstaObroka vrstaObroka) {
        this.vrstaObroka = vrstaObroka;
    }

    public static double izracunajKalorije(Obrok sastojci){
        double kalorije=0;
        for (Sastojak x: sastojci.getSastojci()){
            kalorije +=x.getBrojKalorija();
        }

        return kalorije;
    }


}
