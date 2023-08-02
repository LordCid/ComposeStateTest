package com.example.composecodelabstates.presentation

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.composecodelabstates.presentation.model.WellnessTask

class WellnessViewModel: ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val task: List<WellnessTask>
        get() =_tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }


}

//Mocked data
private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }