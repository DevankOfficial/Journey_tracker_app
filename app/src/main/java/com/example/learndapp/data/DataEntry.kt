package com.example.learndapp.data

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import com.example.learndapp.Homepage.Preview
import kotlin.random.Random

data class JourneyDetails(
    val destination: String,
    var stops: SnapshotStateList<Stop> = mutableStateListOf(),

)

data class Stop(
    val name: String,
    val distance: Double,
    val timeToCover: Double,
    val preSum:Double,
    val preTimesum : Double,
    var selected :Boolean,
    val visa: String
)

fun generateRandomStops(): SnapshotStateList<Stop> {
    val stops = mutableStateListOf<Stop>()
    val stopCount = Random.nextInt(5, 16)
    var sum=0.0
    var sumtime=0.0
    for (i in 1..stopCount) {
        val stopName = "Stop $i"
        val distance = Random.nextDouble(5.0, 20.0)
        val timeToCover = Random.nextDouble(10.0, 30.0)
        val visa = ('A'..'Z').random().toString()
        sum+=distance
        sumtime+=timeToCover
        stops.add(Stop(name = stopName, distance = distance, timeToCover = timeToCover , preSum = sum , preTimesum = sumtime,false, visa=visa))
    }
    return stops
}
