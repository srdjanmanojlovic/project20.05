package zadatak1;
//    Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario
//    (celobrojna vrednost) i poeni se mogu menjati kroz adekvatnu metodu.
//    Alpinista može da savlada sve uspone do 4000 metara,
//    placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
//    a informacije o alpinisti se ispisuju u formatu:
//            Alpinista, id: id
//            ime: ime i prezime
//            Broj poena: poeni
public class Alpinista extends Planinar{
    private int poeni;
    private int maxUsponAlpinista = 4000;
    public int clanarina = 1500;

    public Alpinista(String idPlaninara, String imePlaninara, String prezimePlaninara) {
        super(idPlaninara, imePlaninara, prezimePlaninara);
    }

    public Alpinista(String idPlaninara, String imePlaninara, String prezimePlaninara, int poeni) {
        super(idPlaninara, imePlaninara, prezimePlaninara);
        this.poeni = poeni;
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    @Override
    public String toString() {
        return "Alpinista id: " + super.getIdPlaninara()+ '\''
                + "ime i prezime : " +super.getImePlaninara() + " " + super.getPrezimePlaninara() + '\''
                + "poeni: " + poeni ;
    }

    @Override
    double clanarinaPlaninara() {
        if ((clanarina - (poeni*50))>0){
            clanarina = clanarina- (poeni*50);
        } else
            System.err.println("niste dobro uneli poene");
        return clanarina;
    }

    @Override
    boolean uspesanUspon(Planina planina) {
        if (maxUsponAlpinista>planina.getVisinaPlanine()){
            return true;
        }else return false;

    }
}
