package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarGenerator {
    private List<Car> cars;

    public CarGenerator(String names) {
        this.cars = forCars(names);
    }

    public List<Car> forCars(String names) {
        String[] carNames = names.trim().split(",");
        List<Car> cars = new ArrayList<>();

        for(String name : carNames) {
            cars.add(new Car(name));
        }

        return cars;
    }

    public List<Car> getCars() {
        return this.cars;
    }
}
