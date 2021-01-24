package com.s22034.goldys;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {

    static Pattern imieNazwisko = Pattern.compile("[a-zA-Z]+");
    static Pattern rokUrodzenia = Pattern.compile("[0-9]{4}");
    static Pattern plec = Pattern.compile("[KM]");
    static Pattern kodPocztowy = Pattern.compile("\\d{2}-\\d{3}");

    static Pattern isBinary = Pattern.compile("[01]+");
    static Pattern isBinaryWithOnes = Pattern.compile("1[01]*1");

    static Pattern firstExpression = Pattern.compile("a{4}b{2}c{2}h");
    static Pattern secondExpression = Pattern.compile("b{2}a{4}c{2}h");
    static Pattern thirdExpression = Pattern.compile("c{2}a{3}c{2}h");
    static Pattern fourthExpression = Pattern.compile("b{2}a{4}b{2}h");
    static Pattern fifthExpression = Pattern.compile("abch");


    static public boolean imieNazwiskoChecker(String imie){
        Matcher matcher = Patterns.imieNazwisko.matcher(imie);
        return  matcher.matches();
    }

    static public boolean rokUrodzeniaChecker(int rokUrodzenia){
        Matcher matcher = Patterns.rokUrodzenia.matcher("" + rokUrodzenia);
        return  matcher.matches();
    }

    static public boolean plecChecker(String plec){
        Matcher matcher = Patterns.plec.matcher(plec);
        return  matcher.matches();
    }

    static public boolean kodPocztowyChecker(String kodPocztowy){
        Matcher matcher = Patterns.kodPocztowy.matcher(kodPocztowy);
        return matcher.matches();
    }

    static public boolean isBinaryChecker(String binary){
        Matcher matcher = Patterns.isBinary.matcher(binary);
        return matcher.matches();
    }

    static public boolean isBinaryWithOnesChecker(String binary){
        Matcher matcher = Patterns.isBinaryWithOnes.matcher(binary);
        return matcher.matches();
    }

    static public boolean firstExpressionChecker(String expression){
        Matcher matcher = Patterns.firstExpression.matcher(expression);
        return matcher.matches();
    }

    static public boolean secondExpressionChecker(String expression){
        Matcher matcher = Patterns.secondExpression.matcher(expression);
        return  matcher.matches();
    }

    static public boolean thirdExpressionChecker(String expression){
        Matcher matcher = Patterns.thirdExpression.matcher(expression);
        return matcher.matches();
    }

    static public boolean fourthExpressionChecker(String expression){
        Matcher matcher = Patterns.fourthExpression.matcher(expression);
        return matcher.matches();
    }

    static public boolean fifthExpressionChecker(String expression){
        Matcher matcher = Patterns.fifthExpression.matcher(expression);
        return matcher.matches();
    }
}