package com.rpg.arena;

// interface aksi bertarung
public interface AksiBertarung {

     // method untuk menyerang lawan
    // mengembalikan damage bertipe int
    int serang();

    // method bertahan
    void bertahan();

    // method menggunakan item
    void gunakanItem();
}