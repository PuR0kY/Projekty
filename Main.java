import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args){

        ArrayList<Pojistenec> pojistenci = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        String[] kategorie = {"Přidat nového pojištěného", "Vypsat všechny pojištěné", "Vyhledat pojištěného", "Konec"};
        int index = 0;

//Start
        out.println("--------------------------------");
        out.println("Evidence pojištěných");
        out.println("--------------------------------");
while(index != 3){
// Výpis seznamu možností:
        out.println("Vyberte si akci: ");
        out.println("--------------------------------");
        for (int i = 0; i < kategorie.length; i++){
            out.println((i) + " - " + kategorie[i]);
        }
        out.println();
        index = scanner.nextInt();
        String nazev;
        String prijmeni;
        int telefonniCislo;
        int vek;
        String vstup;
        String hledaneJmeno;
        String hledanePrijmeni;
        boolean nalezeno = false;
//Druhé zacyklování programu:


            switch (index) {
                case 0 -> {
                    out.println("Zadejte jméno pojistníka: ");
                    scanner.nextLine(); //potřeba vyčistit buffery aby kod fungoval správně..
                    nazev = scanner.nextLine();
                    out.println("Zadejte příjmení pojistníka: ");
                        prijmeni = scanner.nextLine();
                    out.println("Zadejte telefonní číslo pojistníka: ");
                        telefonniCislo = scanner.nextInt();
                    out.println("Zadejte věk pojistníka");
                        vek = scanner.nextInt();

                    //přidání pojištěnce do ArrayListu:

                    pojistenci.add(new Pojistenec(nazev, prijmeni, telefonniCislo, vek));

                    out.println("Ukládám do databáze...Stiskněte ENTER..");
                    scanner.nextLine();
                    vstup = scanner.nextLine();
                }
                case 1 -> {
                    if(pojistenci.isEmpty()) out.println("Nemám žádné záznamy.");
                    else
                        out.println("Výpis vedených pojištěnců:");
                        out.println("--------------------------------");
                        for (Pojistenec pojistenec : pojistenci) {
                            out.println(pojistenec.getName() + " " + pojistenec.getPrijmeni() + " " + pojistenec.getVek() + "       " + pojistenec.getTelefonniCislo());
                        }
                            out.println("--------------------------------");
                            out.println();

                }
                case 2 -> {
                    //vyhledat..
                    out.println("Zadejte hledané jméno:");
                    scanner.nextLine();
                    hledaneJmeno = scanner.nextLine();
                    out.println("Zadejte hledané příjmení:");
                    hledanePrijmeni = scanner.nextLine();
                    for (Pojistenec pojistenec : pojistenci){
                        if(pojistenec.getName().equals(hledaneJmeno) && pojistenec.getPrijmeni().equals(hledanePrijmeni)){
                            out.println("Výpis vedených pojištěnců:");
                            out.println("--------------------------------");
                            out.println(pojistenec.getName() + " " + pojistenec.getPrijmeni() + " " +  pojistenec.getVek() + "      " +  pojistenec.getTelefonniCislo());
                            out.println("--------------------------------");
                            out.println();
                            nalezeno = true;
                            break;
                        }
                    }if (!nalezeno){
                        out.println();
                        out.println("Pojištěnec s hledaným jménem nebyl nalezen.");
                        out.println();
                    }
                }
                case 3 -> {
                    out.println("Ukončuji program..");
                    out.println("--------------------------------");
                    out.println("Designed by Matěj Pur");
                    index = 3;
                }
            }
        }
    }
}