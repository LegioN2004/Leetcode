1class Solution {
2    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
3        int count = 0;
4        // for(int i = 0; i < hours.length; i++){
5        //     if(hours[i] >= target){
6        //         count++;
7        //     }
8        // }
9        // better solution
10        for(int hour: hours){
11            if(hour >= target)
12                count++;
13        }
14        return count;
15    }
16}