package com.example.common.task.unDoneTask

import com.example.common.task.Task
import com.example.common.task.archive.DoneTask

interface UnDoneTask : Task {
    val dueDate : Long
    fun doneTask() : DoneTask
}