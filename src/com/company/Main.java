package com.company;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Main {
//yhym
    public static void main(String[] args) throws FileNotFoundException {
	System.out.println("do dupy z tym \n\n\n cos jeszcze?"); //keke
        /*
        * f
        * dfdfd
        * fdafdsf
        * fasdfasdf
        * */
        System.out.print("\n\ncoś tu powinno być\n\n\n");
/*
        //Konwersje
        int a=5;
        double b=13.2;
        double c;
        c=b/a;
        System.out.print("C=");
        System.out.println(c+"\n\n\n");
*/
        // wejscie i wyjscia

/*        String imie,nazwisko; //zmienne pod imie i nazwisko
        Scanner odczyt= new Scanner(System.in); // deklaracja obiektu do odczytywania
        System.out.print("Podaj imie: \n");
        imie = odczyt.nextLine();  //przypisanie odczytywanego gówna
        System.out.print("\n");
        System.out.print("Podaj nazwisko: \n");
        nazwisko =odczyt.nextLine();
        System.out.print("SPierdalaj \n"+imie+" "+nazwisko+"\n\n");
*/
            // Utwórz dwie zmienne typu double. Następnie przy użyciu klasy Scanner pobierz od użytkownika dwie liczby i wykonaj na nich dodawanie, odejmowanie, mnożenie i dzielenie, wyświetlając wyniki w kolejnych liniach na konsoli.
 /*       double liczba1,liczba2;
        Scanner abb=new Scanner(System.in);
        System.out.print("Podaj pierwsza liczbe: ");
        liczba1=abb.nextDouble();
        System.out.print("\n\nPodaj druga liczbe: ");
        liczba2=abb.nextDouble();
        System.out.print("\nDodawanie: "+(liczba1+liczba2)+" \nOdejmowanie: "+(liczba1-liczba2)+" \nMnożenie: "+(liczba1*liczba2)+" \nDzielenie: "+(liczba1/liczba2));
  */

            //1.9 Pobierz w konsoli dwie liczby całkowite, następnie porównaj je i wyświetl stosowny komunikat z wynikiem.
/*
        int a,b;
        Scanner odczyt= new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        a=odczyt.nextInt();
        System.out.println("\nPodaj druga liczbe");
        b=odczyt.nextInt();
        if(a==b) {
            System.out.print("\n a i b są równe");
        }else if(a>b){
            System.out.print("\na="+a+" > b="+b);
        }else{
            System.out.print("\na="+a+" < b="+b);
        }
*/
        //1.10 Napisz program, który pobierze od użytkownika imię i przechowa je w zmiennej. Następnie stwórz kilka warunków z różnymi imionami. Jeśli któreś z imion będzie pasowało wyświetl "Cześć jakieś_imię", gdy program nie znajdzie imienia wyświetl "Przykro mi, ale Cię nie znam".

/*
        String imie;
        System.out.println("Podaj imie kurwiu:");
        Scanner spierdalaj = new Scanner(System.in);
        imie= spierdalaj.nextLine();

        switch(imie){
            case "Brajan":
                System.out.print("\nSpierdalaj gówniarzu");
                break;
            case "Piotr" :
                System.out.print("\nZacne imie milordzie");
                break;
            case "Gówniak":
                System.out.print("\n * FACEPAM *");
                break;
            default:
                System.out.print("o kurwa, chujowe to imie");
        }

*/
       File plik= new File();
       // Scanner odczyt = new Scanner(new File("kody.txt"));
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String imie = input.nextLine();

        PrintWriter zapis = new PrintWriter("imie.txt");
        zapis.print(imie);
        zapis.close();

        Scanner odczyt = new Scanner(new File("imie.txt"));
        System.out.println(odczyt.nextLine());
    }
}
