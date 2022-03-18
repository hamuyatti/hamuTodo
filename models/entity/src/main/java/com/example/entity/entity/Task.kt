package com.example.entity.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.common.task.TaskBase


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