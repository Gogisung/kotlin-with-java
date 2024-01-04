package com.lannstark.lec07;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class Lec07Main {

  public static void main(String[] args) throws IOException {

  }

  private int parseIntOrThrow(@NotNull String str) {
    try {
      return Integer.parseInt(str);
    }catch (NumberFormatException e) {
      throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다."));
    }
  }

  private Integer parseIntOrThrowV2(@NotNull String str) {
    try {
      return Integer.parseInt(str);
    }catch (NumberFormatException e) {
      return null;
    }
  }
}
