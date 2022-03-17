package com.example.common.task

data class FailedTask(
    override val id: Long,
    override val name: String
):Task {
}