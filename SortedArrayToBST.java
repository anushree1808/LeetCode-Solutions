package LeetCode;
import LeetCode.AddNodeAtDepth;
public class SortedArrayToBST {
	public TreeNode sortedArrayToBST2(int[] nums) 
	{
		if (nums == null || nums.length == 0) return null;
        return convert(nums, 0, nums.length);
    }
    
    public TreeNode convert(int[] nums, int start, int end) 
    {
        if (start == end) return null;
        if (start + 1 == end) return new TreeNode(nums[start]);

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = convert(nums, start, mid);
        root.right = convert(nums, mid + 1, end);
        return root;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        return tree(nums, 0, nums.length-1);    
    }
    
    public TreeNode tree(int[] nums, int low, int high)
    {
        if (low > high)
        {
            return null;
        }
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = tree(nums, low, mid-1);
        root.right = tree(nums,mid+1, high);
        return root;
    }
}

