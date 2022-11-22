package bridge.views;

import static bridge.messages.OutputMessage.ATTEMPTS_NUMBER;
import static bridge.messages.OutputMessage.FAIL;
import static bridge.messages.OutputMessage.FINISH_GAME_RESULT;
import static bridge.messages.OutputMessage.GAME_SUCCESS_OR_FAIL;
import static bridge.messages.OutputMessage.START_MESSAGE;
import static bridge.messages.OutputMessage.SUCCESS;

import bridge.domain.enums.CrossStatus;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(final String movingResultMap) {
        System.out.println(movingResultMap);
        System.out.println();
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(final String movingResultMap, final int gameCount, final CrossStatus movingResultStatus) {

        System.out.println(FINISH_GAME_RESULT);
        System.out.println(movingResultMap);
        System.out.println();
        System.out.println(GAME_SUCCESS_OR_FAIL + getMessageOfStatus(movingResultStatus));
        System.out.println(ATTEMPTS_NUMBER + gameCount);
    }

    private String getMessageOfStatus(final CrossStatus movingResultStatus) {
        if (movingResultStatus == CrossStatus.FAIL) {
            return FAIL;
        }
        return SUCCESS;
    }

    public void printStartMessage() {
        System.out.println(START_MESSAGE);
        System.out.println();
    }

    public void printErrorMessage(final String errorMessage) {
        System.out.println(errorMessage);
        System.out.println();
    }
}
