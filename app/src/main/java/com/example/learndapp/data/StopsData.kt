package com.example.learndapp.data

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import kotlin.random.Random

data class JourneyDeets(
    val dest: String,
    var stops_list: SnapshotStateList<Stop> = mutableStateListOf(),
    )

data class Stop(
    val name: String,
    val currDist: Double,
    val timeNeeded: Double,
    val TotDist:Double,
    val timeTaken : Double,
    var reachedStatus :Boolean,
    var visa: String = ('A'..'Z').random().toString()
)

fun generateRandomStops(): SnapshotStateList<Stop> {
    val stops = mutableStateListOf<Stop>()
    val stopCnt = Random.nextInt(5, 16)
    var sum=0.0
    var sumtime=0.0

    for (i in 1..stopCnt) {
        val visa = ('A'..'Z').random().toString()

        val distance = Random.nextDouble(5.0, 20.0)
        val timetaken = Random.nextDouble(10.0, 30.0)
        sum+=distance
        sumtime+=timetaken
        stops.add(
            Stop(
                name = "Stop $i", currDist = distance, timeNeeded = timetaken ,
                TotDist = sum , timeTaken = sumtime,false, visa=visa)
        )
    }
    return stops
}
