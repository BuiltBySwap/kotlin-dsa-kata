# kotlin-dsa-kata

Data structures and algorithms in **idiomatic Kotlin**, solved by *pattern* — each solution has tests, complexity notes and the trigger phrase that tells me which pattern to use.

## How this repo works

```
src/main/kotlin/patterns/<pattern>/LC<number>_<Name>.kt
src/test/kotlin/patterns/<pattern>/LC<number>_<Name>Test.kt
patterns/NOTES_TEMPLATE.md      ← copy into patterns/<pattern>/NOTES.md
MISTAKES.md                     ← every wrong attempt, with the lesson
```

## Pattern index

| Pattern | Trigger phrase (when to use it) | Problems | Status |
|---|---|---|---|
| Prefix sum + hash map | "count subarrays with sum = k" | LC 560 | ⬜ |
| Sliding window | "longest / shortest substring or subarray with a condition" | LC 3 | ⬜ |
| Two pointers | "sorted array, find pairs / triplets" | LC 15 | ⬜ |
| Binary search | _fill in_ | | ⬜ |

## Rules

1. Try 20 minutes honestly before looking at hints.
2. Write the test first, including edge cases.
3. State time and space complexity in a comment.
4. Add a line to `MISTAKES.md` for every wrong attempt.
