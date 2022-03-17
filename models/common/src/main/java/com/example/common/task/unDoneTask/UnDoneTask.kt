package com.example.common.task.unDoneTask

import com.example.common.task.Task
import com.example.common.task.archive.DoneTask

interface UnDoneTask : Task {
    fun doneTask(unixDoneDate: Long): DoneTask

    companion object {
        const val POSTPONE_ABLE_COUNT = 3
    }
}