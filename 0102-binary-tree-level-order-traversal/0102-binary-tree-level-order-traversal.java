
class Solution {
        public static int height(TreeNode root) {
		if(root==null || root.left==null && root.right==null) {
			return 0;
		}
		return 1 + Math.max(height(root.left) , height(root.right));
	}
	
	public static void kthlevel_elem2(TreeNode root , int n , List<Integer> res) { //left to right
		if(root == null) return;
		if(n==1) {
			res.add(root.val);
			return;
		}
		kthlevel_elem2(root.left , n-1 , res);
		kthlevel_elem2(root.right , n-1 , res);
	}
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> ans = new ArrayList<>();
         int levels = height(root)+1;
         if (root == null ) return ans;
         for(int i=1 ; i<=levels ; i++) {
            List<Integer> res = new ArrayList<>();
             kthlevel_elem2(root , i , res);
		
            ans.add(res);
         }
            return ans;
    
        
    }
}