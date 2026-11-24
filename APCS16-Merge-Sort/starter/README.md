# Merge sort starter

Run `javac Main.java MergeSort.java && java Main`. The two sorted input arrays merge to `[-3, -1, 2, 4, 4, 8]`. Trace both input indices and the output index. When equal values are at the front, the helper takes the left value first.

For the optional sort, complete `mergeSort`. Return normally for lengths zero and one. Split longer inputs into two shorter arrays, sort each, then merge them. Keep the input unchanged.

Add a call in `main` for `[12, 4, -3, 4, 0]` and check that it returns `[-3, 0, 4, 4, 12]`. Also try empty, one-element, duplicate-heavy, and already-sorted arrays. Explain why each level merges at most the original input length in values and why repeated halving gives logarithmically many levels.
