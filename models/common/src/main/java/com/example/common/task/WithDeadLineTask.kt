package com.example.common.task

data class WithDeadLineTask(
    override val id: Long,
    override val name: String,
    override val dueDate: Long
) : UnDoneTask {
    override fun doneTask() {
        TODO("Not yet implemented")
    }

}