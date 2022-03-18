package com.example.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.common.task.Task
import com.example.db.dao.TaskDao


@Database(entities = [Task::class], version = 1)
abstract class TaskDataBase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}