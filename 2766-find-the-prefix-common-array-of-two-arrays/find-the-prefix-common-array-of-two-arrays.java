class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        HashSet<Integer> seenInA = new HashSet<>();
        HashSet<Integer> seenInB = new HashSet<>();
        
        int commonCount = 0;
        for (int i = 0; i < n; i++) {
            if (seenInB.contains(A[i])) {
                commonCount++;
            }
            seenInA.add(A[i]);
            
            if (seenInA.contains(B[i])) {
                commonCount++;
            }
            seenInB.add(B[i]);
            C[i] = commonCount;
        }

        return C;
    }
}