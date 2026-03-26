1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3List<Boolean> d = new ArrayList<>(candies.length);
4				int b = 0;
5				for(int i = 0; i < candies.length; i++){
6						if (candies[i] > b) {
7								b = candies[i];
8						}
9				}
10				for (int j = 0; j < candies.length; j++) {
11						if(candies[j] + extraCandies >= b){
12						d.add(true);
13						} else {
14								d.add(false);
15						}
16				}
17				return d;
18    }
19}