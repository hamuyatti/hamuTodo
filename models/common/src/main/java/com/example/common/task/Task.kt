package com.example.common.task

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,
    val task :TaskBase
){
    companion object{
        fun create(task: TaskBase): Task {
            return Task(
                task = task
            )
        }
    }
}