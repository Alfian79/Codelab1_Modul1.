package org.example;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class InputDataDiri {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nama Anda: ");
        String firstName = input.nextLine();

        System.out.print("input gender Anda (L/P): ");
        char gender = input.next().charAt(0);

        input.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggal_bulan_tahun = input.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggal_bulan_tahun);

        LocalDate sekarang = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, sekarang);

        System.out.println("Nama Anda: " + firstName);

        if (gender == 'L') {
            System.out.println("Jenis Kelamin Anda: Laki-Laki");
        } else if (gender == 'P') {
            System.out.println("Jenis Kelamin Anda: Perempuan");
        } else {
            System.out.println("Maaf, format gender tidak sesuai");
        }

        System.out.println("Umur Anda: " + selisih.getYears() + " tahun " + selisih.getMonths() + " bulan " + selisih.getDays() + " hari");
    }
}
