package com.example.composecodelabstates.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composecodelabstates.presentation.WellnessViewModel
import com.example.composecodelabstates.presentation.model.WellnessTask


@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
){
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTaskList(
            list = wellnessViewModel.task,
            onCloseTask =  { task -> wellnessViewModel.remove(task) }
        )
    }
}