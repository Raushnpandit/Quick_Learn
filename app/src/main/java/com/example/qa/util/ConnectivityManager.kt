package com.example.qa.util

import android.content.Context
import android.net.NetworkInfo
import android.net.ConnectivityManager


class ConnectivityManager {

    fun checkConnectivity(context: Context): Boolean{

        val connectivityManager = context.getSystemService(context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo

        if (activeNetwork?.isConnected != null){
            return activeNetwork.isConnected
        }else{
            return false
        }
    }
}
