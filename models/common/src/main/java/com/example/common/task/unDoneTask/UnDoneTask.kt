package com.example.common.task.unDoneTask

import com.example.common.task.TaskBase
import com.example.common.task.archive.DoneTask

interface UnDoneTask : TaskBase {
    fun doneTask(unixDoneDate: Long): DoneTask

    companion object {
        const val POSTPONE_ABLE_COUNT = 3
    }
}