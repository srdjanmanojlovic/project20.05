package Zadatak1;

import java.util.ArrayList;

// Svaki sastojak ima broj kalorija i naziv sastojka.
public class Main {
 public static void main(String[] args) {
  Sastojak sastojak1 = new Sastojak(200, "brasno");
  Sastojak sastojak2 = new Sastojak(300, "cokolada");
  Sastojak sastojak3 = new Sastojak(350, "banana");
  Sastojak sastojak4 = new Sastojak(50, "zelena salata");
  Sastojak sastojak5 = new Sastojak(1, "voda");
  Sastojak sastojak6 = new Sastojak(45, "mleko");
  Sastojak sastojak7 = new Sastojak(100, "jagoda");

  ArrayList<Sastojak> sastojci = new ArrayList<>();
  sastojci.add(sastojak1);
  sastojci.add(sastojak3);

  ArrayList<Sastojak> uzina = new ArrayList<>();
  uzina.add(sastojak3);
  uzina.add(sastojak6);
  uzina.add(sastojak7);


  Obrok dorucak = new Obrok(sastojci, VrstaObroka.zdrav);
  System.out.println(Obrok.izracunajKalorije(dorucak));
  Obrok uzina1 = new Obrok(uzina, VrstaObroka.zdrav);
  System.out.println(Obrok.izracunajKalorije(uzina1));



 }
}
