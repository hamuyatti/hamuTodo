package com.example.common.task

interface TaskBase {
    val id: Long
    val name: String
    val unixDueDate : Long
}