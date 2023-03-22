package com.dmdev.level2.practice.generics;

import com.dmdev.level2.practice.generics.heroes.Archer;
import com.dmdev.level2.practice.generics.heroes.Warrior;
import com.dmdev.level2.practice.generics.weapon.Bow;
import com.dmdev.level2.practice.generics.weapon.Sword;

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Legolas", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Boromir", 10);
        warrior.setWeapon(new Sword());
    }
}
