package patterns.prefixsum

/**
 * LC 560 — Subarray Sum Equals K
 * Pattern: ?
 * Time: O(?)   Space: O(?)   <- fill in after you solve it
 */
fun subarraySum(nums: IntArray, k: Int): Int {
    var prefixSum = 0
    var count = 0

    val prefixSumFrequency = HashMap<Int, Int>()
    prefixSumFrequency[0] = 1

    for (number in nums) {
        prefixSum += number

        val requiredPrefixSum = prefixSum - k

        count += prefixSumFrequency.getOrDefault(requiredPrefixSum, 0)

        prefixSumFrequency[prefixSum] =
            prefixSumFrequency.getOrDefault(prefixSum, 0) + 1
    }

    return count
}