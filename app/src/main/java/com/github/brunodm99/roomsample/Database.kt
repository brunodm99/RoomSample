package com.github.brunodm99.roomsample

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Person::class],
    version = 1)
abstract class Database : RoomDatabase(){
    abstract fun personDao(): PersonDao
}