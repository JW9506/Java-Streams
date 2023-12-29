package com.quickstart._IOStreambasic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class File_Reader {
  public static void main(String[] args) {
    String fileName = "input.txt"; // Replace with your file name

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = reader.readLine()) != null) {
        log.info(line);
      }
    } catch (IOException e) {
      log.error("An error occurred while reading the file.", e);
    }
  }
}
