package com.example.common.task

data class DoneTask(
    override val id: Long,
    override val name: String
) : Task