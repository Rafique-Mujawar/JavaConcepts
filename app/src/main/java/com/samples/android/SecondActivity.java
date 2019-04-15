package com.samples.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.samples.R;

public class SecondActivity extends AppCompatActivity {

  private static final String TAG = SecondActivity.class.getName();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    Log.i(TAG, "onCreate: ");
  }

  @Override
  protected void onRestart() {
    super.onRestart();
    Log.i(TAG, "onRestart: ");
  }

  @Override
  protected void onStart() {
    super.onStart();
    Log.i(TAG, "onStart: ");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.i(TAG, "onResume: ");
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.i(TAG, "onPause: ");
  }

  @Override
  protected void onStop() {
    super.onStop();
    Log.i(TAG, "onStop: ");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Log.i(TAG, "onDestroy: ");
  }

  @Override
  protected void onUserLeaveHint() {
    super.onUserLeaveHint();
    //Log.i(TAG, "onUserLeaveHint: ");
  }

  @Override
  public void onUserInteraction() {
    super.onUserInteraction();
    //Log.i(TAG, "onUserInteraction: ");
  }
}
