package com.example.composecodelabstates.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.composecodelabstates.R

@Composable
fun WaterCounter(modifier: Modifier = Modifier){
    var count = 0
    Column(
        modifier = modifier.padding(16.dp)
    ) {
        Text(stringResource(R.string.glasses_counter_label, count))
        Button(
            onClick = { count ++  },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text(stringResource(R.string.add_one_button_label))
        }
    }

}