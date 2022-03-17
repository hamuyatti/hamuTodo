package com.example.common.task.archive

import com.example.common.task.Task

data class DoneTask(
    override val id: Long,
    override val name: String
) : Task