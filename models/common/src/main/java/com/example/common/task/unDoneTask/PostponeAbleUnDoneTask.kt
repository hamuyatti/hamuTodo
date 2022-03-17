package com.example.common.task.unDoneTask

import com.example.common.task.archive.DoneTask
import com.example.common.task.unDoneTask.UnDoneTask.Companion.POSTPONE_ABLE_COUNT

data class PostponeAbleUnDoneTask(
    override val dueDate: Long,
    override val id: Long,
    override val name: String,
    val postPoneCount: Int = 0
) : UnDoneTask {
    override fun doneTask(): DoneTask {
        return DoneTask(
            id = id,
            name = name,
        )
    }

    fun postPone(): UnDoneTask {
        return if (postPoneCount < POSTPONE_ABLE_COUNT) {
            this.copy(
                postPoneCount = postPoneCount.plus(1))
        } else {
            WithDeadLineTask(
                id = id,
                name = name,
                dueDate = dueDate
            )
        }
    }
}