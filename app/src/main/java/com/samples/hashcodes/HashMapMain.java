package com.samples.hashcodes;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rafique Mujawar
 * Date 04-04-2019
 */
public class HashMapMain {

  public static void main(String[] args) {
    Employee emp1 = new Employee("Martin", 27);
    Map<Employee, String> hm = new HashMap<Employee, String>();
    hm.put(emp1, "Verified");
    emp1.setName("John");
    System.out.println(hm.get(emp1));
  }
}
