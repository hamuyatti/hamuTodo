package com.example.common.task.archive

import com.example.common.task.TaskBase

data class FailedTask(
    override val id: Long = 0,
    override val name: String,
    override val unixDueDate: Long
): TaskBase