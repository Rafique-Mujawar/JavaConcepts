package com.samples.usage;

import android.view.View;

/**
 * There are 6 usages of 'this' keyword
 * 1: to refer current class instance variable
 * 2: to invoke current class method
 * 3: to invoke current class constructor
 * 4: Can be passed as an argument in the method call
 * 5: can be passed as an argument in the constructor call
 * 6: to return the current class instance from method
 * @author Rafique Mujawar
 * Date 05-07-2018
 */
public class WaysToUse_this_Keyword{

  String name;

  public static void main(String[] args){
    final SampleData data = new SampleData();
    data.dummyInit("Rafique");
    System.out.println("Data after first initialise:"+data.sampleValue);
    //1:See Details
    data.actualInit("Rafique");
    System.out.println("Data after second initialise:"+data.sampleValue);

    //2:See Details
    data.initViaInternalMethods("euqifar");
    System.out.println("Data after regular initialise:"+data.sampleValue);

    //3:See Details
    SampleData data1 =  new SampleData(true);

    //4:See Details
    data1.show();

    //5:See details
    final SampleData data2 = data1.getAnObject();
    System.out.println("getAnObject:"+data2.sampleValue);

    WaysToUse_this_Keyword keyword = new WaysToUse_this_Keyword();
    keyword.name = "superb";
    //6: See Details
    keyword.setUpData();

  }

  private void setUpData(){
    final SampleData data =  new SampleData();
    new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        //TODO 6: Use of this keyword to pass augument of perticular parent class.To make
        // reference in an inner class
        data.setKeywordClass(WaysToUse_this_Keyword.this);
      }
    };
  }
}

class SampleData {
  String sampleValue;

  public void dummyInit(String sampleValue) {

    /*argument variable names are same as member variable names,In this case JVM gives priority to
    local variables over member variables*/
    this.sampleValue = sampleValue;
  }

  public void actualInit(String sampleValue) {
    //TODO 1: this keyword is used to refer current class instance variable
    this.sampleValue = sampleValue;
  }

  public void initViaInternalMethods(String sampleValue){
    //TODO 2: this keyword is used to refer current class method.Both are perfectly fine
    this.setSampleValue(sampleValue);
  }
  public void init(String value){
    /*argument variable names are different from member variable names.This works perfectly fine*/
    sampleValue = value;
    System.out.println("SampleData:actualInit");
  }
  public SampleData() {
  }
  public SampleData(boolean a) {
    /*TODO 3: this keyowrd is used to invoke different constructor of same class. i.e. used in
     constructor chaining */
    this("Sample");
  }

  public SampleData(String sampleValue) {
    this.sampleValue = sampleValue;
  }

  public void setSampleValue(String sampleValue) {
    this.sampleValue = sampleValue;
  }


  public void show(){
    //TODO 4: to pass object as a parameter
    printDetailsOfObject(this);
  }
  public void printDetailsOfObject(SampleData data){
    System.out.println("printDetailsOfObject :"+data.sampleValue);
  }

  public SampleData getAnObject(){
    //TODO 5: this keyword is used to return the current object.
    return this;
  }

  public void setKeywordClass(WaysToUse_this_Keyword keywordClass){
    this.setSampleValue(keywordClass.name);
  }
}
