package Zadatak2;
//  Za fudbalere je potrebno znati
//        njihovu poziciju u timu i tržišnu vrednost (ne sme biti negativna vrednost).
public class Fudbaler extends Sportista{
    private String pozicija;
    private double trzisnaVrednost;

    public Fudbaler(String ime, String prezime, String jmbg, SportskiNivoi sportskiNivoi) {
        super(ime, prezime, jmbg, sportskiNivoi);
    }

    public Fudbaler(String ime, String prezime, String jmbg, SportskiNivoi sportskiNivoi, String pozicija, double trzisnaVrednost) {
        super(ime, prezime, jmbg, sportskiNivoi);
        this.pozicija = pozicija;
        this.trzisnaVrednost = trzisnaVrednost;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public double getTrzisnaVrednost() {
        return trzisnaVrednost;
    }

    public void setTrzisnaVrednost(double trzisnaVrednost) {
        if (trzisnaVrednost>=0){

        this.trzisnaVrednost = trzisnaVrednost;}
    }

    @Override
    public String toString() {
        return "Fudbaler{" +
                "pozicija='" + pozicija + '\'' +
                ", trzisnaVrednost=" + trzisnaVrednost +
                "} " + super.toString();
    }
}
