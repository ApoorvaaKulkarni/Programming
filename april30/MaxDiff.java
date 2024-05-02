public class MaxDiff {
    //Find maximum difference between two elements in
    // an array where larger element appears after smaller ele
    public static void main(String[] args) {
        int[] a = new int[]{7, 9, 5, 6, 13, 2};
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[i] < a[j]){
                    max = Math.max(max, a[j] - a[i]);
                }
            }
        }
        System.out.println(max);
    }
}
