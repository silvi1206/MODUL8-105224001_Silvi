package com.rpg.main; // package utama game

import java.util.Scanner; // import scanner untuk input

import com.rpg.entitas.Monster; // import class monster
import com.rpg.entitas.Pahlawan; // import class pahlawan

// class utama game
public class GameEngine {

    public static void main(String[] args) {

        // scanner input untuk membaca input user
        Scanner input = new Scanner(System.in);

        // input nama hero dari user
        System.out.print("Masukkan nama pahlawan : ");

        String namaHero = input.nextLine(); // baca nama hero dari input user

        // object pahlawan dengan nama dari input user, hp 150, base damage 20, mana 100, level 2
        Pahlawan pahlawanUtama = new Pahlawan( namaHero,150,20,100, 2);

        // array monster untuk lawan bertarung
        Monster[] daftarMonster = {

                new Monster( "Goblin", 50,10, "Kecil"),
                new Monster("Orc",80,15,"Besar"),
                new Monster("Dragon", 120,25,"Boss")
        };

        // looping monster 
        for (int i = 0; i < daftarMonster.length;i++) {

            // ambil monster dari array
            Monster monsterSekarang = daftarMonster[i];

            System.out.println("\n=== Melawan " + monsterSekarang.getNama()+ " ===" );

            // battle loop 
            // selama hp hero dan monster masih > 0
            while (pahlawanUtama.getHp() > 0 && monsterSekarang.getHp() > 0) {

                // tampil status hero dan monster
                pahlawanUtama.tampilkanStatus();

                monsterSekarang.tampilkanStatus();

                // menu aksi hero
                System.out.println("\n1. Serang" );

                System.out.println( "2. Skill");

                System.out.println("3. Bertahan / Heal");

                System.out.print( "Pilih : " );

                int pilihan = input.nextInt(); // baca pilihan aksi dari input user
 
                switch (pilihan) { // switch case untuk aksi hero

                    // serang biasa
                    case 1:
                     int damageSerangan = pahlawanUtama.serang(); // hitung damage serangan hero

                    monsterSekarang .terimaDamage(damageSerangan ); // monster menerima damage serangan hero

                    System.out.println("Hero menyerang sebesar " + damageSerangan ); // tampilkan damage serangan hero

                    break; // break agar keluar dari switch case

                    // skill
                    case 2:

                    int damageSkill = pahlawanUtama.serang("Fire Slash",20); // hitung damage skill hero dengan nama skill dan mana cost

                    monsterSekarang.terimaDamage(damageSkill ); // monster menerima damage skill hero

                    System.out.println("Skill damage : " + damageSkill ); // tampilkan damage skill hero

                    break; // break agar keluar dari switch case

                    // defend + heal
                    case 3:

                        pahlawanUtama.bertahan(); // aktifkan defend hero

                        pahlawanUtama.gunakanItem(); // hero menggunakan item untuk heal

                        break; // break agar keluar dari switch case

                    // pilihan salah
                    default:

                        System.out.println("Pilihan tidak ada!"); // tampilkan pesan pilihan tidak ada
                }

                // monster menyerang balik jika masih hidup
                if (monsterSekarang.getHp() > 0) {

                    int damageMonster = monsterSekarang.serang(); // hitung damage serangan monster

                    pahlawanUtama.terimaDamage(damageMonster); // hero menerima damage serangan monster

                    System.out.println(monsterSekarang.getNama() + " menyerang balik sebesar " + damageMonster); // tampilkan damage serangan monster
                }
            }

            // jika hero kalah break loop monster
            if (pahlawanUtama.getHp() <= 0) {

                break;
            }

            // monster kalah tampilkan pesan
            System.out.println( monsterSekarang.getNama() + " kalah!");
        }

        // ending game 
        if (pahlawanUtama.getHp() > 0) { // jika hero masih hidup setelah lawan semua monster

            System.out.println("\nSelamat! Dungeon berhasil ditamatkan!" );

        } else { // jika hero kalah

            System.out.println("\nGame Over!");
        }

        input.close(); // tutup scanner input
    }
}