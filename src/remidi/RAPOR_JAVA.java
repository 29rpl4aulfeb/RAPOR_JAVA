/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidi;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class RAPOR_JAVA {

    /**
     * @param args the command line arguments
     */
    public static String bil (String a){
        return a;
    }
    public static void main(String[] args) {

        Scanner yo = new Scanner (System.in);
        String nama,kelas,absen;
        System.out.print("Nama: ");
        nama = (yo.nextLine());
        System.out.print("Kelas: ");
        kelas = (yo.nextLine());
        System.out.print("No.Absen: ");
        absen = (yo.nextLine());
        System.out.println("===================================================");
        
        String a = "Kriteria Rapor";
        System.out.println(a);
        String[]kriteria= {"","Tugas Harian","Ulangan Harian", "PTS", "PAS"};
        for (int i =1; i<kriteria.length;i++){
            System.out.println(i+" = "+kriteria[i]);}
        
        System.out.println("===================================================");
        System.out.print("Nilai Tugas Harian: ");
        int b= (yo.nextInt());
        System.out.print("Nilai Ulangan Harian: ");
        int c= (yo.nextInt());
        System.out.print("Niali PTS: ");
        int d= (yo.nextInt());
        System.out.print("Nilai PAS: ");
        int e = (yo.nextInt());
        
        System.out.println("===================================================");
        int all = b+c+d+e;
        int hsl = all/4;
        System.out.println("Nilai Keseluruhan: "+hsl);
        
        if (hsl>=85){
            System.out.println("Kategori: A");
        } else if (hsl>=75){
            System.out.println("Kategori : B");
        } else if (hsl>= 55){
            System.out.println("Kategori : C");
        } else if (hsl >= 45){
            System.out.println("Kategori : D");
        } else {
            System.out.println("Kategori : F");
        }
        System.out.println("===================================================");
        System.out.println("Apakah siswa ini harus perbaikan ?");
        char ket = 'y';
        switch (ket){
            case 'y':
                System.out.println("Ya, siswa harus perbaikan");
            case 'a':
                System.out.println("atau");
            case 't':
                System.out.println("Tidak, siswa tidak perlu perbaikan");
        }
    }
    
}
