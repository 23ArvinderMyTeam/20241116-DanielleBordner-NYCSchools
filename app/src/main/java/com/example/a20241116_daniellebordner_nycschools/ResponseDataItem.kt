package com.example.a20241116_daniellebordner_nycschools

import com.google.gson.annotations.SerializedName

data class ResponseDataItem(

    @SerializedName("school_name")
    var school_name: String? = null,

)