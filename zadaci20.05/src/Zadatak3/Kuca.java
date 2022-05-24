package Zadatak3;
///Za kuću čuvamo da li ima dvorište.// Napraviti metodu racunajCenu()
////        koja računa cenu nekretnine za kuću 1300 * kvadratura.
public class Kuca extends Nekretnina{
    private boolean imaDvoriste;

    public Kuca(String adresa, double kvadratura, Vlasnik vlasnik) {
        super(adresa, kvadratura, vlasnik);
    }

    public Kuca(String adresa, double kvadratura, Vlasnik vlasnik, boolean imaDvoriste) {
        super(adresa, kvadratura, vlasnik);
        this.imaDvoriste = imaDvoriste;
    }

    public boolean isImaDvoriste() {
        return imaDvoriste;
    }

    public void setImaDvoriste(boolean imaDvoriste) {
        this.imaDvoriste = imaDvoriste;
    }

    @Override
    public String toString() {
        return "Kuca{" +
                "imaDvoriste=" + imaDvoriste +
                "} " + super.toString();
    }


    static double izracunajCenu(Kuca kuca) {
        return 1300*kuca.getKvadratura();
    }
}
