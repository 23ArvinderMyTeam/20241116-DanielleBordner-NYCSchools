package com.example.a20241116_daniellebordner_nycschools

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class DataViewModel  @Inject constructor(
    private val apiService: APIService
) : ViewModel(){

    var data = MutableLiveData<ArrayList<ResponseDataItem>>()
    var data_ : LiveData<ArrayList<ResponseDataItem>> = data


   fun fetchDatafromServer(){
       data.postValue(apiService.cityofnewyork().body())
   }
}