package com.quickstart._IOStreambasic;

import java.io.FileInputStream;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ByteRead {
  public static void main(String[] args) throws IOException {
    try (FileInputStream in = new FileInputStream("input.txt");) {
      byte[] buffer = new byte[3];
      int len;
      while ((len = in.read(buffer)) != -1) {
        log.info("Reading: {}", new String(buffer, 0, len));
      }
    }
  }
}
