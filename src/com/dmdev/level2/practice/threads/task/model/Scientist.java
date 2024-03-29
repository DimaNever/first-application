package com.dmdev.level2.practice.threads.task.model;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Scientist {

    private final Map<RobotDetail, Integer> robotDetails = new EnumMap<>(RobotDetail.class);
    private final String name;

    public Scientist(String name) {
        this.name = name;
    }

    public void addRobotDetails(List<RobotDetail> list) {
        list.forEach(detail -> robotDetails.merge(detail, 1, Integer::sum)); //как работает?
    }

    public List<Robot> buildRobots() {
        List<Robot> robots = new ArrayList<>();
        Optional<Integer> robotsCount = robotDetails.values().stream().min(Integer::compareTo);

        robotsCount.ifPresent(count -> { //создание роботов? зачем если можно просто по минималке посмотреть количество?
            for (int i = 0; i < count; i++) {
                robotDetails.forEach((k, v) -> robotDetails.merge(k, -1, Integer::sum)); //как работает?
                robots.add(new Robot());
            }
        });

        return robots;
    }

    public String getName() {
        return name;
    }
}
