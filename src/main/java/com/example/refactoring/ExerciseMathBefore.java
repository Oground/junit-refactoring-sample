package com.example.refactoring;

public class ExerciseMathBefore {

    public static int factorial(int args) {
        if (args <= 0) {
            throw new IllegalArgumentException("0�ȉ��̒l�͕s���ł��B");
        }

        if (13 <= args) {
            throw new IllegalArgumentException("13�ȏ�̒l�͕s���ł��B");
        }

        int answer = 1;
        for (int i = 1; i <= args; i++) {
            answer *= i;
        }
        return answer;
    }
}
