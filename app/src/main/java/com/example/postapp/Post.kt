package com.example.postapp

import android.icu.text.CaseMap.Title

data class Post(
    var userId:String,
    var id:String,
    var title:String,
    var body :String
)
