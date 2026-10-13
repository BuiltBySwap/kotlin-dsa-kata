package patterns.binarysearch

/**
 * LC 875: Koko Eating Bananas
 * Pattern: binary search on the answer ("the smallest speed such that Koko finishes in h hours")
 * Invariant: everything below `lo` is too slow; `hi` is always fast enough.
 *            Each round keeps the middle if it works (hi = mid) and drops it if it does not (lo = mid + 1).
 * Time: O(n log max(piles))   Space: O(1)
 */
fun hoursNeeded(piles: IntArray, speed: Int): Long {
    var hours = 0L                               // Long: the total can pass Int's limit of about 2.1 billion
    for (pile in piles) {
        hours += (pile + speed - 1) / speed      // round up: leftover bananas still need an hour
    }
    return hours
}

fun minEatingSpeed(piles: IntArray, h: Int): Int {
    var lo = 1
    var hi = piles.max()                         // the biggest pile: this speed certainly works
    while (lo < hi) {
        val mid = lo + (hi - lo) / 2             // safe middle: cannot overflow
        if (hoursNeeded(piles, mid) <= h) hi = mid   // fast enough: keep mid, it may be the answer
        else lo = mid + 1                            // too slow: discard mid
    }
    return lo
}
