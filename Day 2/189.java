class Solution {
    public void rotate(int[] nums, int k) 
    {
    	int n = nums.length;
    	int x  = 0;
    	Queue<Integer> myNums = new LinkedList<Integer>();
    	for (int i = nums.length -1; i>-1; i--)
    	{
    		myNums.add(nums[i]);
    	}
    	while (k > 0)
    	{
    		x = myNums.peek();
    		myNums.remove();
    		myNums.add(x);
    		k--;
    	}
    	for (int i = nums.length-1; i>-1; i--)
    	{
    		nums[i] = myNums.poll();
    	}
    }
}
