package com.example.common.task

interface UnDoneTask :Task {
    val dueDate : Long
    fun doneTask()
}