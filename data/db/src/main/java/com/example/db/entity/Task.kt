package com.example.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.common.task.Task

@Entity
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,
    val task :Task
){
    companion object{
        fun create(task: Task): com.example.db.entity.Task {
            return Task(
                task = task
            )
        }
    }
}