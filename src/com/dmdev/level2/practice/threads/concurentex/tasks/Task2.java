package com.dmdev.level2.practice.threads.concurentex.tasks;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * Задан массив случайных целых чисел (от 1 до 300)
 * случайной длины (до 1 млн элементов).
 * Найти максимальный элемент в массиве двумя способами: в
 * одном потоке и используя 10 потоков.
 * Сравнить затраченное в обоих случаях время.
 */
public class Task2 {

    public static void main(String[] args) {

        int[] values = new int[200_000_000];
        Random random = new Random();

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(300) + 1;
        }

        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        trackTime(() -> {
            try {
                return findMaxParallel(values, threadPool);
            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
                return Integer.MIN_VALUE;
            }
//            return Integer.MIN_VALUE;
        });

        trackTime(() -> findMax(values));


        threadPool.shutdownNow();
    }

    private static int trackTime(Supplier<Integer> task) {
        long startTime = System.currentTimeMillis();
        int res = task.get();
        System.out.println(res + ": " + (System.currentTimeMillis() - startTime));
        return res;
    }

    private static int findMax(int[] values) {
        return IntStream.of(values)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    private static int findMaxParallel(int[] values, ExecutorService executorService) throws ExecutionException, InterruptedException {
        return executorService.submit(() -> IntStream.of(values)
                .parallel()
                .max()
                .orElse(Integer.MIN_VALUE)).get();
    }
}
