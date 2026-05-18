package com.rpg.entitas;

import com.rpg.arena.Karakter;

// class monster turunan karakter
public class Monster extends Karakter {

    // atribut tambahan monster
    private String jenisMonster;

    // constructor untuk inisialisasi atribut monster
    public Monster(String nama,
                   int hp,
                   int baseDamage,
                   String jenisMonster) {

        super(nama, hp, baseDamage);

        this.jenisMonster = jenisMonster;
    }

    // override serang 
    @Override
    public int serang() { // monster serang dengan base damage

        return baseDamage;
    }

    // override bertahan
    @Override
    public void bertahan() {

        // heal monster
        hp += 10;

        System.out.println(nama + " memulihkan HP!");
    }

    // override gunakan item
    @Override
    public void gunakanItem() {

        hp += 5; // monster menggunakan item untuk heal

        System.out.println( nama + " menggunakan item monster!");
    }

    // override tampil status monster
    @Override
    public void tampilkanStatus() {

        System.out.println("Nama Monster : " + nama);

        System.out.println("Jenis        : " + jenisMonster);

        System.out.println("HP           : " + hp );
    }
}