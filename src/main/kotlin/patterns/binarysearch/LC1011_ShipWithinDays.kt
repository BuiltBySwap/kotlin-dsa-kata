package patterns.binarysearch

/**
 * LC 1011: Capacity To Ship Packages Within D Days
 * Pattern: binary search on the answer ("the smallest capacity such that everything ships in D days")
 * The search loop is identical to LC 875. Only the check and the bounds change.
 * Bounds: lo = the heaviest package (a smaller ship could never carry it), hi = the total weight (one day).
 * Time: O(n log(sum))   Space: O(1)
 */
fun daysNeeded(weights: IntArray, capacity: Int): Int {
    var days = 1
    var load = 0
    for (w in weights) {
        if (load + w > capacity) {   // today's ship is full: start a new day
            days++
            load = 0
        }
        load += w
    }
    return days
}

fun shipWithinDays(weights: IntArray, days: Int): Int {
    var lo = weights.max()           // must carry the heaviest package
    var hi = weights.sum()           // everything in one day always works
    while (lo < hi) {
        val mid = lo + (hi - lo) / 2
        if (daysNeeded(weights, mid) <= days) hi = mid else lo = mid + 1
    }
    return lo
}
