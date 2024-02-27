转载自：https://juejin.cn/post/6844903616629702669

二分查找（binary search），也称折半搜索，是一种在 有序数组 中 查找某一特定元素 的搜索算法。搜索过程从数组的中间元素开始，如果中间元素正好是要查找的元素，则搜索过程结束；如果某一特定元素大于或者小于中间元素，则在数组大于或小于中间元素的那一半中查找，而且跟开始一样从中间元素开始比较。如果在某一步骤数组为空，则代表找不到。这种搜索算法每一次比较都使搜索范围缩小一半。

时间复杂度:折半搜索每次把搜索区域减少一半，时间复杂度为O(log n)。（n代表集合中元素的个数）
空间复杂度: O(1)。虽以递归形式定义，但是尾递归，可改写为循环。

int binarysearch(int array[], int low, int high, int target) {
    if (low > high) return -1;
    int mid = low + (high - low) / 2;
    if (array[mid] > target)
        return binarysearch(array, low, mid - 1, target);
    if (array[mid] < target)
        return binarysearch(array, mid + 1, high, target);
    return mid;
}
