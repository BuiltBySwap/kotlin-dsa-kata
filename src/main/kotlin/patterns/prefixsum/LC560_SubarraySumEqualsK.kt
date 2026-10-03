package patterns.prefixsum

/**
 * LC 560 — Subarray Sum Equals K
 * Pattern: ?
 * Time: O(?)   Space: O(?)   <- fill in after you solve it
 */
fun subarraySum(nums: IntArray, k: Int): Int {
    var prefixSum = 0
    var count = 0
    val seen = hashMapOf(0 to 1)                    // prefix sum -> times seen so far

    for (number in nums) {
        prefixSum += number
        count += seen[prefixSum - k] ?: 0           // count first...
        seen[prefixSum] = (seen[prefixSum] ?: 0) + 1  // ...then record this prefix
    }
    return count
}