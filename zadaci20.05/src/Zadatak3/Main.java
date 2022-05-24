package Zadatak3;

// Napraviti metodu racunajCenu()
//        koja računa cenu nekretnine za stan po formuli 2000 * kvadratura, a za kuću
//        1300 * kvadratura.  Testirati rad klasa iz Main klase
public class Main {
    public static void main(String[] args) {
        Vlasnik vlasnik01 = new Vlasnik("jovan", "jovanovic", "25464545446");
        Nekretnina nekr01 = new Stan("bulevar novi", 56, vlasnik01);
        Nekretnina nekr02 = new Kuca("klisa", 120, vlasnik01);

        System.out.println(Stan.izracunajCenu((Stan) nekr01));
        System.out.println(Kuca.izracunajCenu((Kuca) nekr02));

    }
}
