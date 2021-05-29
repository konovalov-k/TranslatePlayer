package ru.konovalovk.translateplayer.ui

import java.util.concurrent.TimeUnit

fun convertSecondsToHMmSs(millis: Long): String {
    return String.format("%02d:%02d:%02d",
        TimeUnit.MILLISECONDS.toHours(millis),
        TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)), // The change is in this line
        TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
}