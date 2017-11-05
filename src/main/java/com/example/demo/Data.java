package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Controller
public class Data {


        @RequestMapping("/")
        @ResponseBody
        public String example() {
//            LocalTime localTime1 = LocalTime.now();
//            System.out.println(localTime1);
              SimpleDateFormat simpleDateHere = new SimpleDateFormat();
//            System.out.println( simpleDateHere.format(new Date())" );
            return simpleDateHere.format(new Date());
        }






}
