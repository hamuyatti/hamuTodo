package com.example.common.task.unDoneTask

import com.example.common.task.archive.DoneTask

data class WithDeadLineTask(
    override val id: Long,
    override val name: String,
    override val dueDate: Long
) : UnDoneTask {
    override fun doneTask(): DoneTask {
        TODO("Not yet implemented")
    }

}