package com.example.fragment_muhammadafifsyaifuddin_1412210055;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment_Pip extends Fragment {
    @Override
    public void onAttach(Activity activity){
        Log.i("Fragment", "OnAttach");
        super.onAttach(activity);
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        Log.i("Fragment", "OnCreate");
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        Log.i("Fragment", "onCreateView");
        return inflater.inflate(R.layout.fragment_layout, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        Log.i("Fragment", "onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }
    @Override
    public void onStart(){
        Log.i("Fragment", "onStart");
        super.onStart();
    }
    @Override
    public void onResume(){
        Log.i("Fragment", "onResume");
        super.onResume();
    }
    @Override
    public void onPause(){
        Log.i("Fragment", "onPause");
        super.onPause();
    }
    @Override
    public void onSaveInstanceState(Bundle outState){
        Log.i("Fragment", "onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }
    @Override
    public void onDestroyView(){
        Log.i("Fragment", "onDestroyView");
        super.onDestroyView();
    }
    @Override
    public void onDestroy(){
        Log.i("Fragment", "onDestroy");
        super.onDestroy();
    }
    @Override
    public void onDetach(){
        Log.i("Fragment", "onDetach");
        super.onDetach();
    }
}