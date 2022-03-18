package com.example.repository

import com.example.entity.entity.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {
    fun update(task: Task)

    val allTask : Flow<List<Task>>
}