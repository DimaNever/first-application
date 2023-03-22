package com.dmdev.level2.practice.generics.heroes;

import com.dmdev.level2.practice.generics.weapon.MeleeWeapon;

//public class Warrior<T> extends Hero<T> {

public class Warrior<T extends MeleeWeapon> extends Hero<T> {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " взмахнул мечом на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
