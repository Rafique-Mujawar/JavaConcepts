package com.samples.extra;

/**
 * @author Rafique Mujawar
 *         Date 13-06-2018
 */

public class MainClass {
  int a;
  static int b;
  public static void main(String args[]){

  }

  void lab531(){
    Customer c1 =  new Customer();
    c1.show();
    Customer c2 = new Customer();
    c2.cid = 99;
    c2.name = "Sri";
    c2.phone = 486446452;
    c2.show();
  }

  void lab532(){
    Hello h = new Hello();
    System.out.println(h.a);
    h.a = 99;
    System.out.println(h.a);
  }

  void lab533(){
    Hello h1 = new Hello();
    Hello h2 = new Hello();
    System.out.println(h1.a+"\t"+h2.a);
    h1.a = 99;
    System.out.println(h1.a+"\t"+h2.a);
  }

  void lab534(){
    new Hello().a = 99;
    System.out.println(new Hello().a);
  }

  void lab535(){
    Hello h = null;
    System.out.println(h.a);
  }

  void lab536(){
    //System.out.println(Hello.a);
  }

  void lab537(){
    System.out.println(a);
  }

  void lab538(){
    Hello h = new Hello();
    System.out.println(h.b);
    h.b=99;
    System.out.print(h.b);
  }

  void lab539(){
    Hello h1 = new Hello();
    Hello h2 = new Hello();
    System.out.println(h1.b+"\t"+h2.b);
    h1.b = 99;
    System.out.println(h1.b+"\t"+h2.b);
  }

  void lab540(){
    System.out.println(Hello.b);
  }

  void lab541(){
    Hello h = null;
    System.out.println(h.b);
  }

  void lab542(){
    new Hello().b = 99;
    System.out.println(new Hello().b);
  }

  void lab543(){
    System.out.println(b);
  }


  void lab547(){
    Hello h = new Hello();
    System.out.println("Main:"+h.c);
  }
}
