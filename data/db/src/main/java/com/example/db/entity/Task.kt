package com.example.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.common.task.Task

@Entity
data class Task(
    @PrimaryKey
    val id : Long,
    val task :Task
)