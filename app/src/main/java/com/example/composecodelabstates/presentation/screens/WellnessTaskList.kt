package com.example.composecodelabstates.presentation.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.composecodelabstates.presentation.model.WellnessTask


@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> ,
    onCloseTask: (WellnessTask) -> Unit
) {
    LazyColumn(modifier = modifier) {
        items(
            items = list,
            key = { task -> task.id}
        ) { task ->
            WellnessTaskItem(taskName = task.label, onClose = { onCloseTask(task) })
        }
    }
}