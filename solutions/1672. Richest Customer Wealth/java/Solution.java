class Solution {
    
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)//
                .mapToInt(arr -> Arrays.stream(arr).sum())//
                .max()//
                .getAsInt();
    }
    
}
