public class rat_ppoison {
    public static void main(String[] args) {
        int n = 8;
        int k = 2;  // Number of rats
        int[] positions = {1, 3};  // Positions of the rats (0-indexed)
        int[] poisonTimes = {2, 1};  // Time taken for each rat to reach the poison
        int poisonPosition = 6;  // Position of the poison (0-indexed)                                  
        }   
        int[] timeToReachPoison = new int[n];
        for (int i = 0; i < k; i++) {   
            int pos = positions[i];
            int time = poisonTimes[i];
            timeToReachPoison[pos] = time;
        }
        int minTime = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {   
            if (timeToReachPoison[i] != 0) {
                int time = Math.abs(poisonPosition - i) + timeToReachPoison[i];
                minTime = Math.min(minTime, time);
            }
        }       

    }       
    System.out.println(minTime);    
                                                                                                    
}
