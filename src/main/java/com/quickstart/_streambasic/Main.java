package com.quickstart._streambasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger log = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    List<String> planets = new ArrayList<>();
    Collections.addAll(planets, "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus",
        "Neptune");

    // Stream to Array
    String[] array = planets.stream().filter(s -> s.startsWith("M")).toArray(String[]::new);
    log.info("Array of planets starting with M: {}", Arrays.toString(array));

    // Stream to Set
    Set<String> sets = planets.stream().filter(s -> s.startsWith("M")).collect(Collectors.toSet());
    log.info("Set of planets starting with M: {}", sets);

    // Stream to List
    List<String> filteredList =
        planets.stream().filter(s -> s.startsWith("M")).collect(Collectors.toList());
    log.info("List of planets starting with M: {}", filteredList);
  }
}
