package com.example.sample;

public class MyMath {

    /**
     * a��n������߂�.
     * @param a �x�[�X
     * @param n �w��
     * @return a��n��
     */
    public static double power(int a, int n) {
        if(a >= 100 || n >= 100){
            throw new IllegalArgumentException("100�ȏ�̒l�͕s���ł�");
        }
        return Math.pow(a, n);
    }
}
