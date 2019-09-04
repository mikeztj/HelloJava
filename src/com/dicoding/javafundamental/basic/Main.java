package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main (String [] args)
    {
        System.out.println("Test 123");

        Gitar gitar = new Gitar();
        gitar.bunyi();

        Mobil.jumlahBan();
        Kereta.jumlahBan();
        Motor.jumlahBan();

        Date date = new Date();
        System.out.println("Hari ini="+date);
        Date besok = DateUtils.addDays(date,1);
        System.out.println("Hari ini="+besok);
    }
}
