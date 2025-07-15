package DAY18;

public class canpalceflower {
    /**
     * This method checks if it is possible to place 'n' flowers in the flowerbed
     * without violating the rule that no two flowers can be adjacent.
     *
     * @param flowerbed an array representing the flowerbed where 0 means empty and 1 means occupied
     * @param n the number of flowers to place
     * @return true if it is possible to place 'n' flowers, false otherwise
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                
                boolean emptyLeft = (i == 0 || flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1 || flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;  
                    count++;
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }

        return count >= n;
    }

}
