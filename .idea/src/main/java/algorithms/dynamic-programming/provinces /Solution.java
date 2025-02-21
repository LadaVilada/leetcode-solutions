class Solution {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        UnionFind uf = new UnionFind(n);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Only process the upper triangle of the matrix due to symmetrical
                if (isConnected[i][j] == 1) {
                    uf.union(i, j);
                }
            }
        }

        return uf.getCount()
    }

    public static void main(String[] args) {
       int[][]   isConnected = [
             [1, 1, 0],
             [1, 1, 0],
             [0, 0, 1];]

        findCircleNum();
    }
}