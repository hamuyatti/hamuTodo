package com.example.common.task.unDoneTask

import com.example.common.task.archive.DoneTask

data class PostponeAbleUnDoneTask(
    override val dueDate: Long,
    override val id: Long,
    override val name: String
) : UnDoneTask {
    override fun doneTask(): DoneTask {
        TODO("Not yet implemented")
    }
}