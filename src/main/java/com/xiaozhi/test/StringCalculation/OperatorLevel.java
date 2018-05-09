package com.xiaozhi.test.StringCalculation;

/**
 * Created by huangzh on 2018/2/28.
 */
public enum OperatorLevel {
    PLUS('+', 1),
    SUBSTRACT('-', 1),
    MULTIPLY('*', 2),
    DIVISION('/', 2),
    LEFT_BRACKET('(', 9),
    RIGHT_BRACKET(')', 1),;

    private char operator;
    private int level;

    OperatorLevel(char operator, int level) {
        this.operator = operator;
        this.level = level;
    }

    boolean compareOperatorGreater(char operator1, char operator2) {
        return getOperatorLevelByChar(operator1).level > getOperatorLevelByChar(operator2).level ? true : false;
    }

    OperatorLevel getOperatorLevelByChar(char operator) {
        for (OperatorLevel operatorLevel : OperatorLevel.values()) {
            if (operatorLevel.operator == operator)
                return operatorLevel;
        }
        return null;
    }
}
