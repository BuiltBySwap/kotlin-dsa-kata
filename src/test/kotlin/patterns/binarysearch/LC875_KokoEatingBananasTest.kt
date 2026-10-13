package patterns.binarysearch

import kotlin.test.Test
import kotlin.test.assertEquals

class LC875_KokoEatingBananasTest {
    @Test fun example1() = assertEquals(4, minEatingSpeed(intArrayOf(3, 6, 7, 11), 8))
    @Test fun example2() = assertEquals(30, minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 5))
    @Test fun example3() = assertEquals(23, minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 6))
    @Test fun singlePileInOneHour() = assertEquals(5, minEatingSpeed(intArrayOf(5), 1))
    @Test fun singlePileInTwoHours() = assertEquals(3, minEatingSpeed(intArrayOf(5), 2))
    @Test fun pileOfOne() = assertEquals(1, minEatingSpeed(intArrayOf(1), 1))
    @Test fun oneHourPerPileMeansBiggestPile() = assertEquals(11, minEatingSpeed(intArrayOf(3, 6, 7, 11), 4))
    @Test fun plentyOfTimeMeansSpeedOne() = assertEquals(1, minEatingSpeed(intArrayOf(3, 6, 7, 11), 100))
    @Test fun hugePile() = assertEquals(1_000_000_000, minEatingSpeed(intArrayOf(1_000_000_000), 1))
    @Test fun manyHugePiles() = assertEquals(10_000, minEatingSpeed(IntArray(10_000) { 1_000_000_000 }, 1_000_000_000))
    @Test fun hoursNeededDoesNotOverflowInt() = assertEquals(10_000_000_000_000L, hoursNeeded(IntArray(10_000) { 1_000_000_000 }, 1))
}
