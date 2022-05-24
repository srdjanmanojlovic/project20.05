package Zadatak2;
//Za tenisere treba da pamtimo rang na
////        ATP listi (ne sme biti negativna vrednost).
public class Teniser extends Sportista{
    private int rangATP;

    public Teniser(String ime, String prezime, String jmbg, SportskiNivoi sportskiNivoi) {
        super(ime, prezime, jmbg, sportskiNivoi);
    }

    public Teniser(String ime, String prezime, String jmbg, SportskiNivoi sportskiNivoi, int rangATP) {
        super(ime, prezime, jmbg, sportskiNivoi);
        if(this.rangATP>=0){
        this.rangATP = rangATP;}
    }

    public Teniser() {

    }

    public int getRangATP() {
        return rangATP;
    }

    public void setRangATP(int rangATP) {
        if (this.rangATP>=0)
        this.rangATP = rangATP;
    }

    @Override
    public String toString() {
        return "Teniser{" +
                "rangATP=" + rangATP +
                "} " + super.toString();
    }
}
