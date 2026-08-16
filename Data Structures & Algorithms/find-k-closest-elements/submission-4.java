class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int mindist=0;
        int left=0;
        int right=k-1;
        int[] mor= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            mor[i]=arr[i]; 
            arr[i]=Math.abs(arr[i]-x);
        }
        for(int i=0;i<k;i++){
            mindist+=arr[i];
        }
        int dis=mindist;
        for(int i=k;i<arr.length;i++){
            dis = dis+arr[i];
            dis = dis-arr[(i-k)];
            if(dis<mindist){
                mindist=dis;
                left=(i-k)+1;
                right=i;
            }
        }

        List<Integer> ans= new ArrayList<>();

        for(int i=left;i<=right;i++){
            ans.add(mor[i]);
        }
        return ans;
    }
}