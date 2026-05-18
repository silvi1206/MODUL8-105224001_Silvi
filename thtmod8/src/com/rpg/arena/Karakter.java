package com.rpg.arena; // package arena

// abstract class sebagai parent hero dan monster
// abstract class karakter 
public abstract class Karakter implements AksiBertarung {

    // atribut protected
    protected String nama;
    protected int hp;
    protected int baseDamage;
    protected boolean isDefending;

    // constructor untuk inisialisasi atribut
    public Karakter(String nama,int hp,int baseDamage) {

        this.nama = nama;
        this.hp = hp;
        this.baseDamage = baseDamage;

        // default defend false
        this.isDefending = false;
    }

    // method menerima damage dengan logika defend
    public void terimaDamage(int damage) {

        // jika defend damage setengah
        if (isDefending) {

            damage = damage / 2;

            // reset defend
            isDefending = false;
        }

        // hp dikurangi damage
        hp -= damage;

        // hp minimal 0
        if (hp < 0) {

            hp = 0;
        }
    }

    // getter nama 
    public String getNama() {
        return nama;
    }

    // setter nama 
    public void setNama(String nama) {
        this.nama = nama;
    }

    // getter hp
    public int getHp() {
        return hp;
    }

    // setter hp
    public void setHp(int hp) {
        this.hp = hp;
    }

    // getter base damage 
    public int getBaseDamage() {
        return baseDamage;
    }

    // setter base damage
    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    // getter defending
    public boolean isDefending() {
        return isDefending;
    }

    // setter defending
    public void setDefending(boolean defending) {
        isDefending = defending;
    }

    // abstract method tampilkan status karakter
    public abstract void tampilkanStatus();
}