package com.s22034.goldys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Osoba {

    String imie;
    String nazwisko;
    int rokUrodzenia;
    boolean plec;
    String kodPocztowy;

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public Osoba OsobaCreator(){

        try{
            System.out.println(
                    "Podaj imie: "
            );

            this.imie = bufferedReader.readLine();
            if(!Patterns.imieNazwiskoChecker(imie)){
                throw new NiewlasciweDaneException("Niewlasciwy format imienia!!");
            }

            System.out.println(
                    "Podaj naziwsko: "
            );

            this.nazwisko = bufferedReader.readLine();
            if(!Patterns.imieNazwiskoChecker(nazwisko)){
                throw new NiewlasciweDaneException("Niewlasciwy format nazwiska!!");
            }

            System.out.println(
                    "Podaj rok urodzenia: "
            );

            this.rokUrodzenia = Integer.parseInt(bufferedReader.readLine());
            if(!Patterns.rokUrodzeniaChecker(rokUrodzenia)){
                throw new NiewlasciweDaneException("Niewlasciwy format roku urodzenia!!");
            }

            System.out.println(
                    "Podaj plec (K - kobieta, M - mezczyzna: "
            );

            this.plec = plecHelper(bufferedReader.readLine());

            System.out.println(
                    "Podaj kod pocztowy: "
            );

            this.kodPocztowy = bufferedReader.readLine();
            if(!Patterns.kodPocztowyChecker(kodPocztowy)){
                throw new NiewlasciweDaneException("Bledny kod pocztowy");
            }


        } catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }

        return new Osoba(this.imie, this.nazwisko, this.rokUrodzenia, this.plec ,this.kodPocztowy);
    }

    private Osoba(String imie, String nazwisko, int rokUrodzenia, boolean plec, String kodPocztowy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.plec = plec;
        this.kodPocztowy = kodPocztowy;
    }

    private boolean plecHelper(String p){

        if(!Patterns.plecChecker(p)){
            throw new NiewlasciweDaneException("Podano bledna plec!");
        }
        if(p == "K"){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", plec=" + plec +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", bufferedReader=" + bufferedReader +
                '}';
    }
}