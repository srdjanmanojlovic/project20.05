package Zadatak3;
//Napraviti klasu Nekretnina koja od atributa ima adresu, kvadraturu i podatke
//        o vlasniku. Nekretnina može biti
////        stan ili kuća
public abstract class Nekretnina {
    private String adresa;
    private double kvadratura;
    private Vlasnik vlasnik;


    public Nekretnina() {
    }

    public Nekretnina(String adresa, double kvadratura, Vlasnik vlasnik) {
        this.adresa = adresa;
        this.kvadratura = kvadratura;
        this.vlasnik = vlasnik;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(double kvadratura) {
        this.kvadratura = kvadratura;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }

    @Override
    public String toString() {
        return "Nekretnina{" +
                "adresa='" + adresa + '\'' +
                ", kvadratura=" + kvadratura +
                ", vlasnik=" + vlasnik +
                '}';
    }


}
