package com.example.common.task.unDoneTask

import com.example.common.task.archive.DoneTask

data class WithDeadLineTask(
    override val id: Long = 0,
    override val name: String,
    override val unixDueDate: Long,
    ) : UnDoneTask {
    override fun doneTask(unixDoneDate : Long): DoneTask {
        return DoneTask(
            id = id,
            name = name,
            unixDueDate = unixDueDate,
            unixDoneDate = unixDoneDate
        )
    }
}