package Zadatak3;
// Vlasnik ima ime, prezime i broj lične karte.
public class Vlasnik {
    private String ime;
    private String prezime;
    private String brojLk;

    public Vlasnik() {
    }

    public Vlasnik(String ime, String prezime, String brojLk) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojLk = brojLk;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojLk() {
        return brojLk;
    }

    public void setBrojLk(String brojLk) {
        this.brojLk = brojLk;
    }

    @Override
    public String toString() {
        return "Vlasnik{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", brojLk='" + brojLk + '\'' +
                '}';
    }
}
