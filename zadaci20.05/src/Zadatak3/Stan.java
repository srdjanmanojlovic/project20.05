package Zadatak3;
//. Za stan dodatno čuvamo informaciju koji je sprat i da li ima terasu.
// Napraviti metodu racunajCenu()
//        koja računa cenu nekretnine za stan po formuli 2000 * kvadratura
public class Stan extends Nekretnina{
    private String spratnost;
    private boolean imaTerasu;

    public Stan(String adresa, double kvadratura, Vlasnik vlasnik) {
        super(adresa, kvadratura, vlasnik);
    }

    public Stan(String adresa, double kvadratura, Vlasnik vlasnik, String spratnost, boolean imaTerasu) {
        super(adresa, kvadratura, vlasnik);
        this.spratnost = spratnost;
        this.imaTerasu = imaTerasu;
    }

    public String getSpratnost() {
        return spratnost;
    }

    public void setSpratnost(String spratnost) {
        this.spratnost = spratnost;
    }

    public boolean isImaTerasu() {
        return imaTerasu;
    }

    public void setImaTerasu(boolean imaTerasu) {
        this.imaTerasu = imaTerasu;
    }

    @Override
    public String toString() {
        return "Stan{" +
                "spratnost='" + spratnost + '\'' +
                ", imaTerasu=" + imaTerasu +
                "} " + super.toString();
    }


    static double izracunajCenu(Stan stan) {
        return 2000 * stan.getKvadratura();
    }
}
