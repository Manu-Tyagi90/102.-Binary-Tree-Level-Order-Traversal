class TreeNode {
int val;
TreeNode left, right;
TreeNode (int x) {
val =x;
}
}

public class Solution {
public static List<List<Integer>> levelOrderTraversal (TreeNode root) {
List<List<Integer>> res = new ArrayList<>();
if(root == null) return res;
Queue<TreeNode> q = new LinkedList<>();
q.offer(root);
while( !q.isEmpty()){
int size = q.size();
List<Integer> l1 = new ArrayList<>();
for(int i=0;i<size;i++){
TreeNode node = q.poll();
l1.add(node.val);
if(node.left!=null) {
q.offer(node.left);
}
if(node.right!=null) {
q.offer(node.right);
}
}
res.add(l1);
}
return res;
}
}
