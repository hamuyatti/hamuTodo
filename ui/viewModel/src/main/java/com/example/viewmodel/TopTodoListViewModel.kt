package com.example.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.common.task.Task
import com.example.repository.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TopTodoListViewModel @Inject constructor(
    private val repository: TaskRepository
) : ViewModel() {

     val allTask: LiveData<List<Task>> = repository.allTask.asLiveData()
}