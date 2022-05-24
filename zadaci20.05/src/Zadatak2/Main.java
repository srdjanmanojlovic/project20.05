package Zadatak2;
//        Kreirati nekoliko tenisera u main-u i prikazati onog ko je najbolje rangiran
public class Main {
    public static void main(String[] args) {


        Sportista teniser01 = new Teniser("Djovak", "Nokovic", "554654645546",
                SportskiNivoi.profesionalni, -3);
    Sportista teniser02 = new Teniser();
    teniser02.setIme("rafa");
    teniser02.setPrezime("Federer");
    teniser02.setJmbg("554654544554");
    teniser02.setSportskiNivoi(SportskiNivoi.poluprofesionalni);
    ((Teniser) teniser02).setRangATP(-2);




    }
}
