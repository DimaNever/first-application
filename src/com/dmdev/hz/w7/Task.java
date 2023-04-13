package com.dmdev.hz.w7;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * Даны два файла в формате CSV.
 * CSV (Comma-Separated Values) файл - это обычный текстовый файл,
 * где через запятую (может использоваться и любой другой символ) перечислены значения.
 * Также может быть в первой строчке таких файлов заголовок с названием колонок.
 * <p>
 * Формат первого файла items-price.csv:
 * ID,PRICE
 * 1,9.98
 * 2,25.05
 * 3,16.45
 * <p>
 * Формат второго файла items-name.csv:
 * ID,NAME,DESCRIPTION
 * 1,Шарф,Теплый зимний шарф красного цвета
 * 2,Шапка,Вязаная зеленая шапка
 * 3,Ботинки,Осенние ботинки на толстой подошве
 * <p>
 * Задача:
 * <p>
 * Считать оба CSV файла и объединить их по полю ID в один result.csv, где будут следующие поля: ID,NAME,PRICE.
 * <p>
 * Желательно реализовать доп. функционал:
 * Если для каких-то ID не будет значений в обоих файлах, то записать их в один файл errors.csv, где будет лишь одно поле ID.
 */
public class Task {

    public static <T> void main(String[] args) throws IOException {

        Path price = Path.of("resources", "items-price.txt");
        Path names = Path.of("resources", "items-name.txt");
        List<ItemPrice> itemPrice = ItemUtil.createItemPrice(price);
        List<ItemName> itemName = ItemUtil.createItemName(names);

        System.out.println(itemPrice);
        System.out.println(itemName);
        System.out.println();

        //  Stream.of(itemPrice, itemName).collect(C)


//        Stream.concat(itemPrice, itemName)
//                .collect(Collectors.groupingBy(ItemPrice::getId,
//

    }
}
