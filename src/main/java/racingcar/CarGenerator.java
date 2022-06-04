package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarGenerator {
    public CarGenerator(String names) {
        carNames(names);
    }

    public List<String> carNames(String names) {
        List<String> carNames = new ArrayList<>(Arrays.asList(names.trim().split(",")));
        return carNames;
    }
}
