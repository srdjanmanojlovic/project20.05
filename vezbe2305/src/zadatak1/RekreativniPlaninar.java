package zadatak1;
//Kreirati klasu RekreativniPlaninar koja pored svega što ima Planinar ima i:
//        težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
//        naziv okruga odakle je rekreativni planinar

//        maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//        da li će rekreativni planinar uspešno popeti na planinu zavisi da li je
//        njegov najveći uspon manji od visine planine,
//        s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme
//        koji nosi može da pređe 50 metara manje.

//        rekeativci placaju clanarinu u iznosu od 1000 rsd
//        metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//        Rekreativac, id: id
//        ime: ime prezime Okrug: okrug
public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String okrugPlaninara;
    private double maxUsponPlaninara;
    private double clanarina = 1000;

    public RekreativniPlaninar(String idPlaninara, String imePlaninara, String prezimePlaninara) {
        super(idPlaninara, imePlaninara, prezimePlaninara);
    }

    public RekreativniPlaninar(String idPlaninara, String imePlaninara, String prezimePlaninara, int tezinaOpreme, String okrugPlaninara, double maxUsponPlaninara) {
        super(idPlaninara, imePlaninara, prezimePlaninara);
        this.tezinaOpreme = tezinaOpreme;
        this.okrugPlaninara = okrugPlaninara;
        this.maxUsponPlaninara = maxUsponPlaninara;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getOkrugPlaninara() {
        return okrugPlaninara;
    }

    public void setOkrugPlaninara(String okrugPlaninara) {
        this.okrugPlaninara = okrugPlaninara;
    }

    public double getMaxUsponPlaninara() {
        return maxUsponPlaninara;
    }

    public void setMaxUsponPlaninara(double maxUsponPlaninara) {
        this.maxUsponPlaninara = maxUsponPlaninara;
    }

    public double getClanarina() {
        return clanarina;
    }

    @Override
    public String toString() {
        return "Rekreativac id:  " + super.getIdPlaninara()
                + " ime i prezime : " + super.getImePlaninara() + " " + super.getPrezimePlaninara()
                + " okrugPlaninara: " + okrugPlaninara;
    }

    @Override
    double clanarinaPlaninara() {
        return this.clanarina;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        double visina=0;
        double otezavanje = tezinaOpreme*50;

        if (this.maxUsponPlaninara>planina.getVisinaPlanine()) {
            if ((this.maxUsponPlaninara - otezavanje) > 0) {
                return true;
            }


        }
        return true;
    }
}
