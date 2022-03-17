package com.example.common.task.unDoneTask

import com.example.common.task.archive.DoneTask

data class WithDeadLineTask(
    override val id: Long,
    override val name: String,
    override val unixDueDate: Long,
    ) : UnDoneTask {
    override fun doneTask(): DoneTask {
        return DoneTask(
            id = id,
            name = name,
            unixDueDate = unixDueDate
        )
    }
}