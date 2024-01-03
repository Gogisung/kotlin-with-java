package com.lannstark.lec05;

import java.util.Random;

public class Lec05Main {

  public static void main(String[] args) {
  }

  private void judgeNumber2(int number) {
    if (number == 0) {
      System.out.println("주어진 숫자는 0입니다");
      return;
    }

    if (number % 2 == 0) {
      System.out.println("주어진 숫자는 짝수입니다");
      return;
    }

    System.out.println("주어지는 숫자는 홀수입니다");
  }

  private String getGradeWithSwitch(int score) {
    switch (score / 10) {
      case 9:
        return "A";
      case 8:
        return "B";
      case 7:
        return "C";
      default:
        return "D";
    }
  }
}
