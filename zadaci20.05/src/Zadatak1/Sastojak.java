package Zadatak1;
//Svaki sastojak ima broj kalorija i naziv sastojka.
public class Sastojak {
    private static int brojKalorija;
    private String nazivSastojka;

    public Sastojak() {
    }

    public Sastojak(int brojKalorija, String nazivSastojka) {
        this.brojKalorija = brojKalorija;
        this.nazivSastojka = nazivSastojka;
    }

    public static int getBrojKalorija() {
        return brojKalorija;
    }

    public void setBrojKalorija(int brojKalorija) {
        this.brojKalorija = brojKalorija;
    }

    public String getNazivSastojka() {
        return nazivSastojka;
    }

    public void setNazivSastojka(String nazivSastojka) {
        this.nazivSastojka = nazivSastojka;
    }
}
