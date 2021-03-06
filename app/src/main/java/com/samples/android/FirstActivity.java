package com.samples.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.samples.R;

/**
 * @author Rafique Mujawar
 * Date 19-07-2018
 */
public class FirstActivity extends AppCompatActivity {
  private static final String TAG = FirstActivity.class.getName();

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_first);
    findViewById(R.id.tv_sample).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(FirstActivity.this, SecondActivity.class));
      }
    });
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
