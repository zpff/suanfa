package everyday;

public class IslandPerimeter_463 {
    public int islandPerimeter(int[][] grid) {
        int girth = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int length = 0;
                if (grid[i][j] == 1) {
                    if (j - 1 >= 0 && grid[i][j - 1] == 0 || j - 1 < 0) {
                        length++;
                    }
                    if (j + 1 < grid[0].length && grid[i][j + 1] == 0 || j + 1 == grid[0].length) {
                        length++;
                    }
                    if (i - 1 >= 0 && grid[i - 1][j] == 0 || i - 1 < 0) {
                        length++;
                    }
                    if (i + 1 < grid.length && grid[i + 1][j] == 0 || i + 1 == grid.length) {
                        length++;
                    }
                    girth += length;
                }
            }
        }
        return girth;
    }

    public static void main(String[] args) {
        IslandPerimeter_463 islandPerimeter_463 = new IslandPerimeter_463();
        System.out.println(islandPerimeter_463.islandPerimeter
                (new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
    }
}
