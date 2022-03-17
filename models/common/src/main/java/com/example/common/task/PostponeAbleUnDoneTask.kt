package com.example.common.task

data class PostponeAbleUnDoneTask(
    override val dueDate: Long,
    override val id: Long,
    override val name: String
) : UnDoneTask {
    override fun doneTask() {
        TODO("Not yet implemented")
    }
}