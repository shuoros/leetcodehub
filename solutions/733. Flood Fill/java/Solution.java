class Solution {
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        int initColor = image[sr][sc];
        Stack<int[][]> stack = new Stack<>();
        stack.push(new int[][]{{sr}, {sc}});
        while (!stack.isEmpty()) {
            int[][] current = stack.pop();
            try {
                if (image[current[0][0] - 1][current[1][0]] == initColor)
                    stack.push(new int[][]{{current[0][0] - 1}, {current[1][0]}});
            } catch (ArrayIndexOutOfBoundsException ignored) {
            }
            try {
                if (image[current[0][0] + 1][current[1][0]] == initColor)
                    stack.push(new int[][]{{current[0][0] + 1}, {current[1][0]}});
            } catch (ArrayIndexOutOfBoundsException ignored) {
            }
            try {
                if (image[current[0][0]][current[1][0] - 1] == initColor)
                    stack.push(new int[][]{{current[0][0]}, {current[1][0] - 1}});
            } catch (ArrayIndexOutOfBoundsException ignored) {
            }
            try {
                if (image[current[0][0]][current[1][0] + 1] == initColor)
                    stack.push(new int[][]{{current[0][0]}, {current[1][0] + 1}});
            } catch (ArrayIndexOutOfBoundsException ignored) {
            }
            image[current[0][0]][current[1][0]] = color;
        }
        return image;
    }
    
}
