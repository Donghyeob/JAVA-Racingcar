package racingcar;

import org.junit.jupiter.api.Test;
import camp.nextstep.edu.missionutils.Randoms;

import static org.assertj.core.api.Assertions.assertThat;

class racingCountTest {
    @Test
    void go() {
        int random = Randoms.pickNumberInRange(0, 9);
        String goAndStop = "go";
        System.out.println(random);

        if (random <= 3) {
            goAndStop = "stop";
        }

        System.out.println(goAndStop);


    }
}
