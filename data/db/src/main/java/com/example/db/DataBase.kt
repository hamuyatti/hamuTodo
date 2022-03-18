package com.example.db

import androidx.room.Database
import com.example.db.dao.TaskDao
import com.example.db.entity.Task

@Database(entities = [Task::class],version = 1)
abstract class DataBase {
    abstract fun taskDao() : TaskDao
}