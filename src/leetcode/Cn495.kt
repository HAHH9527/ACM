package leetcode

class Cn495 {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        var nextEndSec = 0
        var sec = 0

        timeSeries.forEach { atkSec ->
            sec += duration
            if (atkSec < nextEndSec) {
                val repeatSec = nextEndSec - atkSec
                sec -= repeatSec
            }
            nextEndSec = atkSec + duration
        }

        return sec
    }
}