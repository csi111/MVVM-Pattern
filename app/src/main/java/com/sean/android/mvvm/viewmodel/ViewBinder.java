package com.sean.android.mvvm.viewmodel;

/**
 * Created by sean on 2017. 1. 2..
 */

public interface ViewBinder extends ViewBindable{
    void setViewModel(ViewModel viewModel);
    ViewModel getViewModel();
}
