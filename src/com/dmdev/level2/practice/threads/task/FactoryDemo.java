package com.dmdev.level2.practice.threads.task;

/*
  Двое безумных учёных устроили соревнование, кто из них соберёт больше роботов за 100 ночей.
  Для этого каждую ночь каждый из них отправляет своего прислужника на свалку фабрики роботов за деталями.

  Чтобы собрать одного робота им нужно:
  Голова, Тело, Левая рука, Правая рука, Левая нога, Правая нога, CPU, RAM, HDD
  В первую ночь на свалке находится 20 случайных деталей.
  Каждую ночь фабрика выбрасывает на свалку от 1 до 4 случайных деталей.

  В то же самое время прислужники обоих учёных отправляются на свалку, и каждый собирает от 1 до 4 случайных деталей.
  Если на свалке деталей нет – прислужник уходит ни с чем.
  Затем они возвращаются домой и отдают детали хозяевам.
  Учёные пытаются собрать как можно больше роботов из деталей, которые они получили.

  Написать программу, симулирующую этот процесс.
  Для симуляции принять, что каждая ночь наступает через 100мс.

  Фабрика и два прислужника действуют в одно и то же время.
  После 100 ночей (около 10 секунд) определить победителя соревнования
 */

import com.dmdev.level2.practice.threads.task.model.RobotDetail;
import com.dmdev.level2.practice.threads.task.model.Scientist;
import com.dmdev.level2.practice.threads.task.thread.Factory;
import com.dmdev.level2.practice.threads.task.thread.Night;
import com.dmdev.level2.practice.threads.task.thread.ScientistAssistant;
import com.dmdev.level2.practice.threads.task.util.RandomUtil;
import com.dmdev.level2.practice.threads.task.util.ThreadUtil;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FactoryDemo {

    public static void main(String[] args) throws InterruptedException {
        Night night = new Night();
        Factory factory = new Factory(night, getInitialRobotDetailsInDump());
        ScientistAssistant badScientistAssistant = new ScientistAssistant(new Scientist("Плохой ученый"), factory.getDump(), night);
        ScientistAssistant goodScientistAssistant = new ScientistAssistant(new Scientist("Хороший ученый"), factory.getDump(), night);

        ThreadUtil.startThreads(night, factory, badScientistAssistant, goodScientistAssistant);
        ThreadUtil.joinThreads(night, factory, badScientistAssistant, goodScientistAssistant);

        viewStatistic(badScientistAssistant.getScientist(), goodScientistAssistant.getScientist());
    }

    private static List<RobotDetail> getInitialRobotDetailsInDump() {
        return IntStream.range(0, 20)
                .map(value -> RandomUtil.getNext(RobotDetail.CASHED_VALUES.size()))
                .mapToObj(RobotDetail.CASHED_VALUES::get)
                .collect(Collectors.toList());
    }

    private static void viewStatistic(Scientist firstScientist, Scientist secondScientist) {
        System.out.println("----------------");
        System.out.println(firstScientist.getName() + " " + firstScientist.buildRobots().size());
        System.out.println(secondScientist.getName() + " " + secondScientist.buildRobots().size());
    }
}
