package michaelmai.algo;

// 讲解视频： https://www.youtube.com/watch?v=GBKI9VSKdGg
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        helper(0,candidates,target,0,ans,subset);
        return ans;
    }
    void helper(int start,int[] candidate,int target,int sum,List<List<Integer>> ans, List<Integer> subset)
    {
        if(sum==target){
            ans.add(new ArrayList(subset));
            return;
        }

        if(start>=candidate.length)
            return;

        if(sum>target)
            return;

        //include
        sum+=candidate[start];
        subset.add(candidate[start]);
        helper(start,candidate,target,sum,ans,subset);

        //exclude
        sum-=candidate[start];
        subset.remove(subset.size()-1);
        helper(start+1,candidate,target,sum,ans,subset);
    }
}
//T.C :- O(2^target  *  k)  // k is the average length/size of subset



