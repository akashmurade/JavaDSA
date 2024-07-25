public class TrappedWater {

    public static int trappedWater(int bars[]) {
        int n = bars.length;

        // checks if there are no bars
        if(n == 0) {
            return 0;
        }

        int tWater = 0; // water trapped will be added to the total water

        // Will make left auxiliary array
        int leftMax[] = new int[n];
        leftMax[0] = bars[0];
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], bars[i]);
        }

        // Will make right auxiliary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = bars[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(bars[i], rightMax[i + 1]);
        }

        // Will traverse and calculate total trapped water
        for(int i = 1; i < n - 1; i++) {
            tWater += (Math.min(leftMax[i], rightMax[i]) - bars[i]);
        }

        return tWater;
    }

    public static void main(String[] args) {
        int bars[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped Water is " + trappedWater(bars));
    }
}
