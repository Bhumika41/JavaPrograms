class diagonalsum {
    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int primary = 0;
        int secondary = 0;
        for(int i=0;i<arr.length;i++) {
            primary=primary+arr[i][i];
            secondary=secondary+arr[i][arr.length-1-i];
        }
        System.out.println("Primary Diagonal Sum = " + primary);
        System.out.println("Secondary Diagonal Sum = " + secondary);
    }
}