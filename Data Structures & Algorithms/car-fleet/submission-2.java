class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Integer[] ind= new Integer[position.length];
        for(int i=0;i<position.length;i++){
            ind[i]=i;
        }
        Arrays.sort(ind, (a,b) -> position[b]-position[a]);
        
        double maxtime=0;
        int ans=0;

        for(int i=0;i<ind.length;i++){
            int diff= target - position[ind[i]];
            double time=(double) diff/speed[ind[i]];
            // if(diff%speed[ind[i]]>0)time++;
            if(maxtime<time){
                ans++;
                maxtime=time;
            }
        }
        return ans;

        // for(int i: ind){
        //     System.out.println(i);
        // }
        // return 0;
    }
}
