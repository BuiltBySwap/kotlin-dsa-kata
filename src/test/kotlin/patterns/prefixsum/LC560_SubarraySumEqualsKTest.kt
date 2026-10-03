package patterns.prefixsum

import kotlin.test.Test
import kotlin.test.assertEquals

class LC560_SubarraySumEqualsKTest {
    @Test fun example1() = assertEquals(2, subarraySum(intArrayOf(1, 1, 1), 2))
    @Test fun example2() = assertEquals(2, subarraySum(intArrayOf(1, 2, 3), 3))
    @Test fun withNegatives() = assertEquals(3, subarraySum(intArrayOf(1, -1, 0), 0))
    @Test fun single() = assertEquals(1, subarraySum(intArrayOf(5), 5))
    @Test fun none() = assertEquals(0, subarraySum(intArrayOf(5), 3))
}