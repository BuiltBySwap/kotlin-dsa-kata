package patterns.binarysearch

import kotlin.test.Test
import kotlin.test.assertEquals

class LC704_BinarySearchTest {
    private val sample = intArrayOf(-1, 0, 3, 5, 9, 12)

    @Test fun found() = assertEquals(4, search(sample, 9))
    @Test fun notFound() = assertEquals(-1, search(sample, 2))
    @Test fun firstElement() = assertEquals(0, search(sample, -1))
    @Test fun lastElement() = assertEquals(5, search(sample, 12))
    @Test fun smallerThanAll() = assertEquals(-1, search(sample, -5))
    @Test fun biggerThanAll() = assertEquals(-1, search(sample, 100))
    @Test fun singleHit() = assertEquals(0, search(intArrayOf(5), 5))
    @Test fun singleMiss() = assertEquals(-1, search(intArrayOf(5), 3))
    @Test fun empty() = assertEquals(-1, search(intArrayOf(), 1))
    @Test fun twoElements() {
        assertEquals(0, search(intArrayOf(1, 3), 1))
        assertEquals(1, search(intArrayOf(1, 3), 3))
    }
}