package com.example.hamutodo.di

import android.content.Context
import androidx.room.Room
import com.example.db.TaskDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTaskDataBase(@ApplicationContext context: Context): TaskDataBase {
        return Room.databaseBuilder(
            context,
            TaskDataBase::class.java,
            "dataBase"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTaskDao(db: TaskDataBase) = db.taskDao()
}