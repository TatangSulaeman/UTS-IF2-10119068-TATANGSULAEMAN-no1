/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.tandanyakamu.uts;

import java.util.Scanner;

/**
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * UTS
 */
public class Main {
    public static void main(String[] args){
        Age age = new Age(2018);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Tahun Lahir Anda : ");
        int yearBorn = scanner.nextInt();
        
        age.setYearBirth(yearBorn);
        
        String outputText = 
                "=====Hasil Perhitungan Umur=====" + "\n" + 
                "Tahun Lahir anda : " + age.getYearBirth() + "\n" +
                "Hari ini tahun : " + age.getYearNow() + "\n" +
                "Umur Kamu Sampai hari ini adalah " + age.hitungUmur() + " Tahun" + "\n" + 
                "Tandanya Kamu " + age.tandanyaKamu(age.hitungUmur()) ;
        System.out.println(outputText);
    }
}
