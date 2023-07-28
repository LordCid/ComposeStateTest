package com.example.composecodelabstates.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.composecodelabstates.R

@Composable
fun WaterCounter(modifier: Modifier = Modifier){
    Column(modifier = modifier.padding(16.dp)) {
        var count by remember { mutableStateOf(0) }
        if(count > 0){
            Text(stringResource(R.string.glasses_counter_label, count))
        }
        Button(
            onClick = { count++  },
            modifier = Modifier.padding(top = 8.dp),
            enabled = count < 10
        ) {
            Text(stringResource(R.string.add_one_button_label))
        }
    }

}
//
//@Composable
//fun WaterCounter(modifier: Modifier = Modifier){
//    Column(modifier = modifier.padding(16.dp)) {
//        var count by remember { mutableStateOf(0) }
//        if(count > 0){
//            var showTask by remember { mutableStateOf(true)  }
//            if(showTask){
//                WellnessTaskItem(
//                    onClose = { showTask = false  },
//                    taskName = "Have you taken your 15 minute walk today?",
//                )
//            }
//            Text(stringResource(R.string.glasses_counter_label, count))
//        }
//        Row(modifier = Modifier.padding(top = 8.dp)) {
//            Button(
//                onClick = { count++  },
//                enabled = count < 10
//            ) {
//                Text(stringResource(R.string.add_one_button_label))
//            }
//            Button(
//                modifier = Modifier.padding(start = 8.dp),
//                onClick = { count = 0 }
//            ) {
//                Text(stringResource(R.string.clear_water_count))
//            }
//        }
//
//    }
//
//}