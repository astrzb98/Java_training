import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


class Kurs {
    String nazwaKursu;
    String termin;
    String miejsce;
    ArrayList<String> trenerzy = new ArrayList<>();
    ArrayList<String> uczestnicy = new ArrayList<>();

    public Kurs(String nazwaKursu, String termin, String miejsce) {
        this.nazwaKursu = nazwaKursu;
        this.termin = termin;
        this.miejsce = miejsce;
    }
    public String getNazwaKursu () {
        return nazwaKursu;
    }

    public void setNazwaKursu (String nazwaKursu){
        this.nazwaKursu = nazwaKursu;
    }

    public String getTermin () {
        return termin;
    }

    public void setTermin (String termin){
        this.termin = termin;
    }

    public String getMiejsce () {
        return miejsce;
    }

    public void setMiejsce (String miejsce){
        this.miejsce = miejsce;
    }

    public ArrayList getTrenerzy() {
        return trenerzy;
    }

    public void setTrener (ArrayList trenerzy){
        this.trenerzy = trenerzy;
    }

    public ArrayList<String> getUczestnicy() {
        return uczestnicy;
    }

    public void setUczestnicy (ArrayList<String> uczestnicy){
        this.uczestnicy = uczestnicy;
    }
}

public class Run {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Kurs> listaKursow = new ArrayList<>();

        String menu, nazwaKursu, trener, uczestnicy, termin, miejsce;

        while (true) {
            System.out.println("D-dodaj kurs,T-dodaj trenera do kursu,K-Dodaj uczestnika do kursu, U-usun trenera z kursu,V-usun uczesnika kursu,W-usun kurs, Z-zmien dane uczestnika,M-Zmodyfikuj dane kursu,K-koniec");
            menu = scanner.nextLine().toUpperCase();
            if (menu.equals("D")) {
                //pytania: nazwa, termin, miejsce
                System.out.println("Podaj nazwe Kursu");
                nazwaKursu = scanner.nextLine();
                System.out.println("Podaj termin kursu");
                termin = scanner.nextLine();
                System.out.println("Podaj miejsce kursu");
                miejsce = scanner.nextLine();
                Kurs kurs = new Kurs(nazwaKursu,termin,miejsce);
                listaKursow.add(kurs);
                System.out.println(kurs.getNazwaKursu());
            } 
            else if (menu.equals("T")) {
                System.out.println("Podaj trenera");
                trener = scanner.nextLine();
                System.out.println("Podaj nazwe Kursu dla ktorego chcesz dodac trenera");
                nazwaKursu = scanner.nextLine();
                for(Kurs kurs : listaKursow){
                    //System.out.println(kurs.getNazwaKursu());
                    if(kurs.getNazwaKursu().equals(nazwaKursu)){
                        kurs.trenerzy.add(trener);
                        //System.out.println(kurs.trenerzy);
                    }
                    else
                        System.out.println("nie ma takiego kursu");
                    
                }
            } 
            
            else if (menu.equals("K")) {
                System.out.println("Podaj uczestnika");
                uczestnicy = scanner.nextLine();
                System.out.println("Podaj nazwe Kursu dla ktorego chcesz dodac uczestnika");
                nazwaKursu = scanner.nextLine();
                for(Kurs kurs : listaKursow){
                    if(kurs.getNazwaKursu().equals(nazwaKursu)){
                        if(kurs.uczestnicy.size() <15){
                            kurs.uczestnicy.add(uczestnicy);
                            System.out.println(kurs.uczestnicy);
                        }
                        else
                            System.out.println("Przekroczono liczbę uczestnikow");
                        
                    }
                    else
                        System.out.println("nie ma takiego kursu");
                }
            } 
            
            else if (menu.equals("U")) {
                System.out.println("Podaj trenera którego chcesz");
                trener = scanner.nextLine();
                System.out.println("Podaj nazwe Kursu z którego chcesz usunąć trenera");
                nazwaKursu = scanner.nextLine();
                for(Kurs kurs : listaKursow){
                    if(kurs.getNazwaKursu().equals(nazwaKursu)){
                        for(String it : kurs.trenerzy){
                            if(it.equals(trener)){
                                kurs.trenerzy.remove(it);
                                System.out.println(kurs.trenerzy);
                            }
                            
                        }
                        
                    }
                    else
                        System.out.println("nie ma takiego kursu");
                }
                
            } 
            
            else if (menu.equals("V")) {
                System.out.println("Podaj uczestnika którego chcesz usunaca");
                uczestnicy = scanner.nextLine();
                System.out.println("Podaj nazwe Kursu z którego chcesz usunąć uczestnika");
                nazwaKursu = scanner.nextLine();
                for(Kurs kurs : listaKursow){
                    if(kurs.getNazwaKursu().equals(nazwaKursu)){
                        
                      
                        for(String it : kurs.uczestnicy){
                            
                            if(it.equals(uczestnicy)){
                                kurs.uczestnicy.remove(it);
                                System.out.println(kurs.uczestnicy);
                            }
                            
                        }
                        
                    }
                    else
                        System.out.println("nie ma takiego kursu");
                }
                
            } 
            else if (menu.equals("W")) {
                System.out.println(listaKursow);
                ArrayList<Kurs> toRemove = new ArrayList<>();
                System.out.println("Podaj nazwe Kursu, który chcesz usunąć");
                nazwaKursu = scanner.nextLine();
                for(Kurs kurs : listaKursow){
                    //System.out.println(kurs.getNazwaKursu());
                    if(kurs.getNazwaKursu().equals(nazwaKursu)){
                        if (kurs.uczestnicy.size()<1)
                            toRemove.add(kurs);
                        else
                            System.out.println("Kurs posiada uczestników nie mozna go usunac");
                        
                    }
                    else
                        System.out.println("nie ma takiego kursu");
                }
                
                listaKursow.removeAll(toRemove);
                
                
            } 
            
            else if (menu.equals("Z")) {
                String nazwisko;
                System.out.println("Podaj nazwe Kursu");
                nazwaKursu = scanner.nextLine();
                System.out.println("Podaj nazwisko uczestnka");
                uczestnicy = scanner.nextLine();
                System.out.println("Podaj nowe nazwisko uczestnka");
                nazwisko = scanner.nextLine();
                for(Kurs kurs : listaKursow){
                    if(kurs.getNazwaKursu().equals(nazwaKursu)){
                        for(String it : kurs.uczestnicy){
                            if(it.equals(uczestnicy)){
                                kurs.uczestnicy.remove(it);
                                kurs.uczestnicy.add(nazwisko);
                                System.out.println(kurs.uczestnicy);
                            }
                        }
                    }
                }
                
            } 
            
            else if (menu.equals("M")) {
                String nazwisko;
                System.out.println("Podaj nazwe Kursu");
                nazwaKursu = scanner.nextLine();
                System.out.println("Podaj termin kursu");
                termin = scanner.nextLine();
                System.out.println("Podaj miejsce kursu");
                miejsce = scanner.nextLine();
                for(Kurs kurs : listaKursow){
                    if(kurs.getNazwaKursu().equals(nazwaKursu)){
                        kurs.setTermin(termin);
                        kurs.setMiejsce(miejsce);
                        
                        System.out.println("Miejsce : " + kurs.getMiejsce() + "termin : " + kurs.getTermin() );
                    }
                }
                
            } 
            else if(menu.equals("Q"))
                break;
        
        }
    }

}








