package com.samples.usage;

import java.io.Serializable;

/**
 * @author Rafique Mujawar
 * Date 01-02-2019
 * <p>
 * https://javarevisited.blogspot.com/2011/03/10-interview-questions-on-singleton.html
 *
 * lazy and early loading of Singleton
 * double checked locking in Singleton
 * prevent for creating another instance of Singleton using clone() method.
 * prevent for creating another instance of Singleton using reflection.
 * prevent for creating another instance of Singleton during serialization.
 *
 */
public class SingletonExample {
  public static void main(String[] args) {
    AccountEnum.INSTANCE.getManager().setUserName("rafique");
    AccountEnum.INSTANCE.getManager().setPassword("welcome@123");
  }
}

enum AccountEnum {

  INSTANCE(AccountManager.getInstance());

  private AccountManager manager;

  AccountEnum(AccountManager manager) {
    this.manager = manager;
  }

  public AccountManager getManager() {
    return manager;
  }
}


class AccountManager implements Serializable {

  private static AccountManager mInstance;

  private AccountManager() {

  }

  public static AccountManager getInstance() {
    if (null != mInstance) {
      mInstance = new AccountManager();
    }
    return mInstance;
  }


  private String mUserName;
  private String mPassword;

  public String getUserName() {
    return mUserName;
  }

  public void setUserName(String mUserName) {
    this.mUserName = mUserName;
  }

  public String getPassword() {
    return mPassword;
  }

  public void setPassword(String mPassword) {
    this.mPassword = mPassword;
  }

  private Object readResolve() {
    return mInstance;
  }
}
