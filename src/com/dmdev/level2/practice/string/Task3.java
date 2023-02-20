package com.dmdev.level2.practice.string;

/**
 * 3. Написать функцию, принимающую в качестве параметров имя, фамилию и
 * отчество и возвращающую инициалы
 * в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом
 * регистре, а результирующая строка должна быть в верхнем.
 */
public class Task3 {
    public static void main(String[] args) {
        String lastName = "неверов";
        String firstName = "дмитрий";
        String patronymicName = "константинович";
        System.out.println(format(lastName, firstName, patronymicName));
    }

    private static String format(String lastName, String firstName, String patronymicName) {
        char firstNameChar = firstName.charAt(0);
        char lastNameChar = lastName.charAt(0);
        char patronymicNameChar = patronymicName.charAt(0);
        //return String.valueOf(lastNameChar + "." + firstNameChar + "." + patronymicNameChar + ".").toUpperCase();
        return String.format("%s.%s.%s.", lastNameChar,firstNameChar,patronymicNameChar).toUpperCase();
    }
}
