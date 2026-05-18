package com.rpg.entitas;

import com.rpg.arena.Karakter;

// class pahlawan turunan karakter
public class Pahlawan extends Karakter {

    // atribut tambahan pahlawan
    private int mana;
    private int level;

    // constructor untuk inisialisasi atribut pahlawan
    public Pahlawan(String nama, int hp, int baseDamage, int mana,int level) {

        super(nama, hp, baseDamage);

        this.mana = mana;
        this.level = level;
    }

    // override serang 
    @Override
    public int serang() {

        return baseDamage * level;
    }

    // overloading serang skill
    public int serang(String namaSkill,
                      int manaCost) {

        // cek mana cukup atau tidak
        if (mana >= manaCost) {

            mana -= manaCost;

            System.out.println(nama + " menggunakan skill " + namaSkill );

            return baseDamage * level * 2;
        }

        // jika mana kurang tampilkan pesan
        System.out.println("Mana tidak cukup!");

        return 0; 
    }

    // override bertahan 
    @Override
    public void bertahan() {

        isDefending = true; // aktifkan defend

        System.out.println(nama + " bersiaga!" ); // tampilkan pesan
    }

    // override gunakan item 
    @Override
    public void gunakanItem() {

        hp += 30; // hp nambah 30

        System.out.println(nama + " menggunakan potion!"); // tampilkan pesan
    }

    // override tampil status
    @Override
    public void tampilkanStatus() { // tampilkan status pahlawan

        System.out.println("Nama  : " + nama);

        System.out.println("HP    : " + hp);

        System.out.println("Mana  : " + mana);

        System.out.println("Level : " + level);
    }
}