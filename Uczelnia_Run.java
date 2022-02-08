import java.util.ArrayList;

//package J29;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator; 

class Student {
    private String imie;
    private String nazwisko;
    private int index;
    //ArrayList<Integer> indexList = new ArrayList<>();

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void dodajIndex(int index) {

        this.index = index;
        System.out.println("index został dodany");
    }

    /*public void usunIndex(int index) {

        this.indexList.remove(index);
        System.out.println("Usunieto");

    }*/

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    
    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", index=" + index +
                '}';
    }
}


public class Uczelnia_Run {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String imie, nazwisko, noweImie, noweNazwisko;
        int menu, index;
        while (true) {

            System.out.println("1-dodaj studenta, 2-wyswietl liste studentow, 3-dodaj nr indeksu.4-usun studenta po indeksie, 5-modyfikacja studenta, 6-koniec");


            menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                //pytania: imie, nazwisko
                System.out.println("Podaj imie");
                imie = scanner.nextLine();
                System.out.println("Podaj nazwisko");
                nazwisko = scanner.nextLine();
                Student student = new Student(imie, nazwisko);
                studentList.add(student);

            } 
            else if (menu == 2) {
                //prezentacja: wyswietl liste uczniow
                for (Student x : studentList) {
                    System.out.println("Imię:" + x.getImie() + " Nazwisko:" + x.getNazwisko());
                }
            } 
            else if (menu == 3) {
                //prezentacja: dodaj nr indeksu studenta

                System.out.println("Podaj nazwisko ");
                nazwisko = scanner.nextLine();
                System.out.println("Podaj nr indexu");
                index = scanner.nextInt();

                for (Student x : studentList) {
                    if (x.getNazwisko().equals(nazwisko)) {
                        x.dodajIndex(index);
                        scanner.nextLine();

                    }
                }
            }
            else if (menu == 4) {
                    //prezentacja: usun studenta po indexie
                    ArrayList<Student> toRemove = new ArrayList<>();
                    System.out.println("podaj nr indexu");
                    index = scanner.nextInt();
                    scanner.nextLine();
                    for (Student y : studentList) {
                    //for(Iterator<Student> y = studentList; y.hasNext();){
                        //Student student = y.next();
                        //int iterated_index = student.getIndex();
                        if (y.getIndex() == index) {
                            toRemove.add(y);
                        }
                    }
                    studentList.removeAll(toRemove);
                    
                    System.out.println("Index został usunięty : "+ index);
            }
            else if (menu == 5) {
                System.out.println("Podaj index do edycji");
                index = scanner.nextInt();
                scanner.nextLine();
                for (Student y : studentList) {
                    if (y.getIndex() == index ) {

                        System.out.println("Podaj nowe imie ");
                        noweImie = scanner.nextLine();

                        System.out.println("Podaj nowe nazwisko ");
                        noweNazwisko = scanner.nextLine();

                        y.setImie(noweImie); //= noweImie;
                        y.setNazwisko(noweNazwisko); //= nazwiskoNowe;
                    }
                }
            } 
            else if (menu == 6) {
                System.out.println("Wyjscie z programu");
            }
                        
                    
                
            
        }
    }
}

