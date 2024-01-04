package com.lannstark.lec07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaFilePrinter {

  public void readFile() throws IOException{
    File currentFIle = new File(".");
    File file = new File(currentFIle.getAbsolutePath() + "/a.txt");
    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
    System.out.println("bufferedReader = " + bufferedReader.readLine());
    bufferedReader.close();
  }

  public void readFile(String path) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      System.out.println(reader.readLine());
    }
  }

}
