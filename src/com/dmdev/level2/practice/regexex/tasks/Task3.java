package com.dmdev.level2.practice.regexex.tasks;

/**
 * 3. Написать программу, выполняющую поиск в строке всех тегов
 * абзацев, в т.ч. тех, у которых есть параметры, например <p id = "p1">,
 * и замену их на простые теги абзацев <p>.
 */
public class Task3 {

    public static void main(String[] args) {
        String regex = "(<p .+?>)(.+?</p>)";
        String input = "<p>afsf dsfsfdsf </p> <b> assdasdd <b/> dfdsfsdfsdfs dsfsdfsf <p id=\"p1\">sdfsf dsfsf</p>" +
                "gdsgersg <p> sfsdf sdfsdf <p id\"p2\">2133 df </p> sddd";
        System.out.println(input.replaceAll(regex, "<p>$2"));
    }
}
