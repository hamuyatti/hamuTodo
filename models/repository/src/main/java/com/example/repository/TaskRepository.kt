package com.example.repository

import com.example.common.task.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {
    fun update(task: Task)

    val allTask : Flow<List<Task>>
}