package Zadatak2;
//Agenciju opisuju naziv i adresa.
public class Agencija {
    private String naziv;
    private String adresa;

    public Agencija() {
    }

    public Agencija(String naziv, String adresa) {
        this.naziv = naziv;
        this.adresa = adresa;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Agencija{" +
                "naziv='" + naziv + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}
