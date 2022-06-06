package racingcar;

import camp.nextstep.edu.missionutils.Console;
import common.CommonCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarRacing {
    private CarGenerator carGenerator;
    List<Integer> distance = new ArrayList<>();
    String winners = "";

    public void racing() {
        initCar();
        startRacing(inputCount());
        winner();
    }
    public void initCar() {
        try {
            this.carGenerator = new CarGenerator(inputName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            validateError(String.valueOf(e).matches(".*[ERROR].*"));
        }
    }

    public void startRacing(int gameCount) {
        System.out.println("실행 결과");
        while(gameCount > 0){
            gameCount--;
            this.carGenerator.carMove();
            System.out.println(System.lineSeparator());
        }
    }

    public void winner() {
        for(Car winner : carGenerator.getCars()){
            distance.add(winner.getDistance());
        }
        Collections.max(distance);
        for (Car winner : carGenerator.getCars()) {
            winners = winnerNames(winner, Collections.max(distance));
        }
        System.out.println("최종 우승자: " + winners.substring(0,winners.length() - 1));
    }

    public String winnerNames(Car winner, int maxDis) {
        if(winner.getDistance() == maxDis) {
            winners+=winner.getName() + ",";
        }
        return winners;
    }

    public void validateError(boolean y) {
        if(y) initCar();
    }

    public String inputName() {
        System.out.println(CommonCode.INPUT_CAR_NAME_MESSAGE.getMessage());
        return Console.readLine().trim();
    }

    public int inputCount() {
        System.out.println(CommonCode.INPUT_ROUND_COUNT_MESSAGE.getMessage());
        int number;
        try {
            number = Integer.parseInt(Console.readLine());
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException(CommonCode.INPUT_INTEGER_ERR.getMessage());
        }
        return number;
    }
}
