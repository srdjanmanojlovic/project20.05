package Zadatak2;
//O svim sportistima je potrebno da pamtimo
//        ime, prezime i JMBG, a znamo da se sportisti dele na fudbalere i tenisere.
public class Sportista {
    private String ime;
    private String prezime;
    private String jmbg;
    private SportskiNivoi sportskiNivoi;

    public Sportista() {
    }

    public Sportista(String ime, String prezime, String jmbg, SportskiNivoi sportskiNivoi) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.sportskiNivoi = sportskiNivoi;
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

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public SportskiNivoi getSportskiNivoi() {
        return sportskiNivoi;
    }

    public void setSportskiNivoi(SportskiNivoi sportskiNivoi) {
        this.sportskiNivoi = sportskiNivoi;
    }

    @Override
    public String toString() {
        return "Sportista{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", jmbg='" + jmbg + '\'' +
                ", sportskiNivoi=" + sportskiNivoi +
                '}';
    }
}
