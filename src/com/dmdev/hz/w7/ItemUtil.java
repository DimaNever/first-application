package com.dmdev.hz.w7;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemUtil {

    private ItemUtil() {
    }

    static public List<ItemPrice> createItemPrice(Path path) throws IOException {
        List<ItemPrice> prices = new ArrayList<>();
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                prices.add(new ItemPrice(line));
            }
            return prices;
        }
    }

    static public List<ItemName> createItemName(Path path) throws IOException {
        List<ItemName> names = new ArrayList<>();
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                names.add(new ItemName(line));
            }
            return names;
        }
    }

    static public void add(Path path)  {

    }


}
