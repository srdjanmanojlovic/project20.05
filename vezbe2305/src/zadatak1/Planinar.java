package zadatak1;
//Kreirati klasu Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime.
//        Svi podaci smeju da se dohvate, ali ne i postave mimo konstruktora koji postavlja sve attribute klase.
//        Pored toga, klasa ima:
//        apstraktnu metodu štampaj
//        apstraktnu metodu koja vraca clanarinu planinara
//        apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
//        Metoda kao ulazni parametar prima objekat tipa Planina.

public abstract class Planinar {
    private String idPlaninara;
    private String  imePlaninara;
    private String prezimePlaninara;

    public Planinar(String idPlaninara, String imePlaninara, String prezimePlaninara) {
        this.idPlaninara = idPlaninara;
        this.imePlaninara = imePlaninara;
        this.prezimePlaninara = prezimePlaninara;
    }

    public String getIdPlaninara() {
        return idPlaninara;
    }

    public String getImePlaninara() {
        return imePlaninara;
    }

    public String getPrezimePlaninara() {
        return prezimePlaninara;
    }
    @Override
    public abstract String toString();
    abstract double clanarinaPlaninara();
    abstract boolean uspesanUspon(Planina planina);

}
