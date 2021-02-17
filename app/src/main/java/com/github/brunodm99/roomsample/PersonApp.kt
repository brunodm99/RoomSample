package com.github.brunodm99.roomsample

import android.app.Application
import androidx.room.Room

class PersonApp : Application(){
    val room = Room.databaseBuilder(this, Database::class.java, "person")
        .build()
}