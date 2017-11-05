package com.example.demo;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Component
public class MagazynWydatkow {


        private List<Wydatek> wszystkieWydatki;
        private double wartoscCalkowita;

        public MagazynWydatkow() {
            wszystkieWydatki = new ArrayList<>();
            wszystkieWydatki.add(new Wydatek("ciastko", 3.2, "łakocie"));
            wszystkieWydatki.add(new Wydatek("rachunki" ,250, "obowiazki"));
            wszystkieWydatki.add(new Wydatek("maslo", 6.99, "spozywcze"));
            wszystkieWydatki.add(new Wydatek("mleko", 2.99, "spozywcze"));
        }

        public double obliczKosztCalkowity(){
            wartoscCalkowita=0;

            for (Wydatek wydatek: wszystkieWydatki) {
                wartoscCalkowita+= wydatek.getCena();
            }

            return wartoscCalkowita;
        }

        public List<Wydatek> pokazWszystkieWydatki() {
             return wszystkieWydatki;
        }

        public void  dodajWydatek(Wydatek wyd) {
            wszystkieWydatki.add(wyd);
        }

    }



