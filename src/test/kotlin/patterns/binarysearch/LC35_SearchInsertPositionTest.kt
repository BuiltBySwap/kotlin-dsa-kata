package patterns.binarysearch

import kotlin.test.Test
import kotlin.test.assertEquals

class LC35_SearchInsertPositionTest {
    private val sample = intArrayOf(1, 3, 5, 6)

    @Test fun exactMatch() = assertEquals(2, searchInsert(sample, 5))
    @Test fun insertInMiddle() = assertEquals(1, searchInsert(sample, 2))
    @Test fun insertAtEnd() = assertEquals(4, searchInsert(sample, 7))
    @Test fun insertAtStart() = assertEquals(0, searchInsert(sample, 0))
    @Test fun singleEqual() = assertEquals(0, searchInsert(intArrayOf(1), 1))
    @Test fun singleSmaller() = assertEquals(1, searchInsert(intArrayOf(1), 2))
    @Test fun empty() = assertEquals(0, searchInsert(intArrayOf(), 5))
}