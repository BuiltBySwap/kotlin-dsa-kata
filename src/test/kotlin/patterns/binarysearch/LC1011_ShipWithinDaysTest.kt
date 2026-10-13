package patterns.binarysearch

import kotlin.test.Test
import kotlin.test.assertEquals

class LC1011_ShipWithinDaysTest {
    @Test fun example1() = assertEquals(15, shipWithinDays(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5))
    @Test fun example2() = assertEquals(6, shipWithinDays(intArrayOf(3, 2, 2, 4, 1, 4), 3))
    @Test fun example3() = assertEquals(3, shipWithinDays(intArrayOf(1, 2, 3, 1, 1), 4))
    @Test fun singlePackage() = assertEquals(7, shipWithinDays(intArrayOf(7), 1))
    @Test fun eachPackageOwnDay() = assertEquals(5, shipWithinDays(intArrayOf(1, 2, 3, 4, 5), 5))
    @Test fun oneDayCarriesEverything() = assertEquals(15, shipWithinDays(intArrayOf(1, 2, 3, 4, 5), 1))
    @Test fun heavyFirst() = assertEquals(10, shipWithinDays(intArrayOf(10, 1, 1, 1), 2))
    @Test fun orderCannotBeChanged() = assertEquals(11, shipWithinDays(intArrayOf(1, 10, 1, 10), 2))
    @Test fun heaviestPackageSetsTheFloor() = assertEquals(10, shipWithinDays(intArrayOf(10, 1), 2))
}
