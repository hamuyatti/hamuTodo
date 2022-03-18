package com.example.common.task.archive

import com.example.common.task.Task

data class DoneTask(
    override val id: Long = 0,
    override val name: String,
    override val unixDueDate: Long,
    val unixDoneDate: Long
) : Task