package com.example.db.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.db.entity.Task
import kotlinx.coroutines.flow.Flow

interface TaskDao {
    @Query( "select * from Task ORDER BY id DESC")
    fun getTasks() : Flow<List<Task>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(task : Task)
}