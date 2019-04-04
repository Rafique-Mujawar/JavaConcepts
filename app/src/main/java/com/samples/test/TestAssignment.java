package com.samples.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Rafique Mujawar
 * Date 03-04-2019
 */
public class TestAssignment {
  public static void main(String[] args) {
    TestAssignment assignment = new TestAssignment();
    int[] T = new int[10];
    T[0] = 9;
    T[1] = 1;
    T[2] = 4;
    T[3] = 9;
    T[4] = 0;
    T[5] = 4;
    T[6] = 8;
    T[7] = 9;
    T[8] = 0;
    T[9] = 1;

    int soted[] = assignment.solution(T);
    for (int i = 0; i < soted.length; i++) {
      System.out.print(" " + soted[i]);
    }
  }

  public int[] solution(int[] aOriginalCities) {
    // write your code in Java SE 8
    int capital = -1;
    for (int n = 0; n < aOriginalCities.length; n++) {
      if (n == aOriginalCities[n]) {
        capital = n;
      }
    }

    System.out.println("capital :" + capital);

    if (-1 == capital) {
      //TODO: Capital is not given.Data invalid
    }

    Map<Integer, List<Integer>> cityMap = new HashMap<>();
    List<Integer> capitals = new ArrayList<>();
    capitals.add(capital);

    cityMap.put(-1, capitals);

/*    for (int m = 0; m < aOriginalCities.length; m++) {
      List<Integer> newConnections =
          getConnectedNodes(cityMap.get(m-1), aOriginalCities, capital);
      System.out.println("array at"+m+":" + newConnections.toString());
      cityMap.put(m, newConnections);
    }*/
    int currentiteration = -1;
    while (cityMap.get(currentiteration).size() != 0) {
      List<Integer> newConnections =
          getConnectedNodes(cityMap.get(currentiteration), aOriginalCities);
      currentiteration++;
      System.out.println("array at" + currentiteration + ":" + newConnections.toString());
      cityMap.put(currentiteration, newConnections);
    }

    int[] returnSet = new int[cityMap.size() - 1];
    for (int i = 0; i < cityMap.size() - 1; i++) {
      returnSet[i] = cityMap.get(i).size();
    }
    return returnSet;
  }

  private List<Integer> getConnectedNodes(List<Integer> nodes, int[] cities) {
    List<Integer> newConnections = new ArrayList<>();
    for (int n = 0; n < cities.length; n++) {
      for (int node : nodes) {
        if (node == cities[n] && node != n) {
          newConnections.add(n);
        }
      }
    }
    return newConnections;
  }
}
