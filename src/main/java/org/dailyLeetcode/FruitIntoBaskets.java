package org.dailyLeetcode;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> mp = new HashMap<>();
        int i=0,j=0, ans =0;
        while(i<fruits.length) {
            mp.put(fruits[i], mp.getOrDefault(fruits[i], 0) + 1);

            while(mp.size() >2) {
                mp.put(fruits[j], mp.get(fruits[j]) -1 );

                if (mp.get(fruits[j]) == 0)
                    mp.remove(fruits[j]);
                j++;
            }
            ans = Math.max(ans, i-j+1);
            i++;
        }
        return ans;
    }
}
