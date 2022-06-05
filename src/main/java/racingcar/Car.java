package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private CarName carName;
    private CarDistance carDistance;

    public Car(String name) {
        carName = new CarName(name);
        carDistance = new CarDistance();
    }
}