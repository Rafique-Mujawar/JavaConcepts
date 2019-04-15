package com.samples.android;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.samples.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


  private static final String TAG = FirstFragment.class.getName();

  public FirstFragment() {
    // Required empty public constructor
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    Log.i(TAG, "onAttach: ");
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.i(TAG, "onCreate: ");
  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    Log.i(TAG, "onActivityCreated: ");
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_first, container, false);
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    Log.i(TAG, "onViewCreated: ");
  }

  /**
   * Control whether a fragment instance is retained across Activity
   * re-creation (such as from a configuration change).  This can only
   * be used with fragments not in the back stack.  If set, the fragment
   * lifecycle will be slightly different when an activity is recreated:
   * <ul>
   * <li> {@link #onDestroy()} will not be called (but {@link #onDetach()} still
   * will be, because the fragment is being detached from its current activity).
   * <li> {@link #onCreate(Bundle)} will not be called since the fragment
   * is not being re-created.
   * <li> {@link #onAttach(Activity)} and {@link #onActivityCreated(Bundle)} <b>will</b>
   * still be called.
   * </ul>
   *
   * @param retain
   */
  @Override
  public void setRetainInstance(boolean retain) {
    super.setRetainInstance(retain);
  }

  @Override
  public void onStart() {
    super.onStart();
    Log.i(TAG, "onStart: ");
  }


  @Override
  public void onResume() {
    super.onResume();
    Log.i(TAG, "onResume: ");
  }

  @Override
  public void onPause() {
    super.onPause();
    Log.i(TAG, "onPause: ");
  }

  @Override
  public void onStop() {
    super.onStop();
    Log.i(TAG, "onStop: ");
  }

  /**
   * Called when the view previously created by {@link #onCreateView} has
   * been detached from the fragment.  The next time the fragment needs
   * to be displayed, a new view will be created.  This is called
   * after {@link #onStop()} and before {@link #onDestroy()}.  It is called
   * <em>regardless</em> of whether {@link #onCreateView} returned a
   * non-null view.  Internally it is called after the view's state has
   * been saved but before it has been removed from its parent.
   */
  @Override
  public void onDestroyView() {
    super.onDestroyView();
    Log.i(TAG, "onDestroyView: ");
  }

  /**
   * Called when the fragment is no longer in use.  This is called
   * after {@link #onStop()} and before {@link #onDetach()}.
   */
  @Override
  public void onDestroy() {
    super.onDestroy();
    Log.i(TAG, "onDestroy: ");
  }

  /**
   * Called when the fragment is no longer attached to its activity.  This
   * is called after {@link #onDestroy()}.
   */
  @Override
  public void onDetach() {
    super.onDetach();
    Log.i(TAG, "onDetach: ");
  }
}
