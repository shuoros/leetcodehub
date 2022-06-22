class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> allNums = new ArrayList<>();
        allNums.addAll(Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toList()));
        allNums.addAll(Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.toList()));
        Collections.sort(allNums);
        int size = allNums.size();
        if (size % 2 == 0) {
            return (allNums.get(size / 2 - 1) + allNums.get(size / 2)) / 2D;
        } else {
            return allNums.get(size / 2);
        }
    }
    
}
