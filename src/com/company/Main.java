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

    //1.8 Napisz program, w którym wprowadzisz w konsoli swoje imię, następnie zapiszesz je do pliku. Odczytaj je z powrotem z pliku i bez użycia dodatkowej zmiennej wyświetl na ekranie.

        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj Swoje imie czy cos tam\n");
        String imie = input.nextLine();
        PrintWriter zapis = new PrintWriter("Chuj.txt");
        zapis.print(imie);
        zapis.close();

        Scanner odczytpliku = new Scanner(new File("Chuj.txt"));
        System.out.print("\n\n\n" + odczytpliku.nextLine());
        */

//petle
    /*    int licznik = 0;

        while(licznik<10){
            System.out.println("To jest petla");
            licznik++;
        }
        System.out.println("Koniec pętli");
*/



//tablica
    // 1.12 Napisz program, w którym zadeklarujesz i utworzysz pięcioelementową tablicę odpowiedniego typu. W pętli pobierzesz od użytkownika 5 imion i je w niej zapiszesz. Następnie wyświetl na ekranie powiadomienia "Witaj imie_z_tablicy" dla każdego z podanych parametrów.
/*
        String[] imiona = new String[4];
        Scanner czytaj = new Scanner(System.in);
        byte i=0;

        for(i=0;i<4;i++) {
        System.out.println("\nPodaj "+(i+1)+" Imie:");
        imiona[i]=czytaj.nextLine();

        }

        for(i=0;i<4;i++) {
        System.out.println("Witaj "+imiona[i]);
        }
*/

    //1.13 Utwórz tablicę typu int przechowującą n elementów - gdzie n jest parametrem pobieranym od użytkownika. Następnie wypełnij ją liczbami od 1 do n i wyświetl zawartość na ekranie przy pomocy pętli while.
/*
        int n,i=0;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Ile do ilu umiesz liczyć?");
        n=odczyt.nextInt();
        int[] tablica=new int[n];
        while(i<n){
            tablica[i]=i+1;
            System.out.print(tablica[i]+"; ");
            i++;
        }
*/


    }
}
