package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
    http://localhost:8080/wydatki/
    http://localhost:8080/dodajWydatek.html
    http://localhost:8080/wydatki/addget?name=Pieczarki&price=500&type=Zywnosc
    http://localhost:8080/wydatki?kategoria=Domowe
*/


@Controller
public class Controller1 {

    @Autowired
    private MagazynWydatkow magazynWydatkow;


    @RequestMapping("/wydatki/")
    @ResponseBody
    public String poakzWszystkieWydatki() {
        List <Wydatek> listaWydatkow = magazynWydatkow.pokazWszystkieWydatki();
        String pom = "";

        for (Wydatek wyd : listaWydatkow) {
            pom = pom + wyd + "<br/>";
        }
        pom = pom + "Suma: " + magazynWydatkow.obliczKosztCalkowity();
        return pom;
    }

    @GetMapping("/wydatki")
    @ResponseBody
    public String pokazWydatkiDanegoTypu(@RequestParam String kategoria) {

        List<Wydatek> listaWydatkow = magazynWydatkow.pokazWszystkieWydatki();
        String pom = "";
        double suma = 0;

        for (Wydatek wyd : listaWydatkow) {
            if (wyd.getKategoria().equals(kategoria)) {
                pom = pom + wyd + "<br/>";
                suma += wyd.getCena();
            }
        }
        pom = pom + "Wydatki dla tej kategorii: " + suma;
        return pom;
    }


    @PostMapping("/dodaj")
    public String DodajWydatek(@RequestParam String nazwa, @RequestParam double cena, @RequestParam String kategoria) {

        Wydatek nowyWydatek = new Wydatek (nazwa, cena, kategoria) ;
        magazynWydatkow.dodajWydatek(nowyWydatek);
        return "redirect:/wydatki/";
    }


}