package com.samples.usage;

/**
 * 1:final keyword can be applied to 1)Variables, 2)Methods and 3)Classes
 * 2:A final variable that is not initialized at the time of declaration is known as blank final
 *  variable or uninitialized final variable which is initialized in the constructor.
 * 3:The blank final variable can be static also which will be initialized in the static block only.
 * 4:you cannot change the value of final variable(It will be constant).
 * 5:If you make any method as final, you cannot override it.
 * 6:If you make any class as final, you cannot extend it.
 * 7:final method is inherited but you cannot override it.
 *
 * @author Rafique Mujawar
 * Date 06-07-2018
 */
public class UsageOf_Final_Keyword {

}

class TaxPayer{
  int income;
  String name;
  final String PAN_CARD_NUMBER;

  public TaxPayer(String panNumber) {
    this.PAN_CARD_NUMBER = panNumber;
  }
}