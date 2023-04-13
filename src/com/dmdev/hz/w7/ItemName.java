package com.dmdev.hz.w7;

public class ItemName {

    private final Integer id;
    private final String name;
    private final String description;

    public ItemName(String str) {
        if (str == null) {
            id = 0;
            name = "";
            description = "";
        } else {
            String[] strings = str.split(",");
            id = Integer.valueOf(strings[0]);
            name = strings[1];
            description = strings[2];
        }
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ItemName{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
