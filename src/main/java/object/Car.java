package object;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private final String name;
    private int count;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Car[] carGen(String inputName) {
        String[] carName = inputName.split(",");

        Car[] cars = new Car[carName.length];

        for(int i = 0; i < cars.length; i++) {
            cars[i] = new Car(carName[i]);
        }

        return cars;
    }

    public static void carRacing(Car[] cars, String gameRound) {
        int random = Randoms.pickNumberInRange(0, 9);
        if (random >= 4) {
            // 인스턴스 분리
        }
    }
}