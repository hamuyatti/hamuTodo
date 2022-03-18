package com.example.repository

import com.example.db.dao.TaskDao
import com.example.common.task.Task
import kotlinx.coroutines.flow.Flow

class TaskRepositoryImpl(
    private val dao: TaskDao
) : TaskRepository{
    override fun update(task: Task) {
        dao.insert(task)
    }

    override val allTask: Flow<List<Task>>
        get() = dao.getTasks()
}