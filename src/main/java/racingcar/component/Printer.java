package racingcar.component;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Printer {
    private Printer() {}

    private static Printer printer;

    public static Printer getPrinter() {
        if (printer == null) {
            printer = new Printer();
        }
        return printer;
    }

    public void printCurrent(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + car.getProgress());
        }
        System.out.println();
    }

    private Queue<Car> getWinners(List<Car> cars) {
        int top;
        int i = 0;
        Queue<Car> winners = new LinkedList<>();

        Collections.sort(cars);
        top = cars.get(0).getProgress().length();

        while (cars.get(i).getProgress().length() == top) {
            winners.add(cars.get(i));
            i++;
        }

        return winners;
    }
}
