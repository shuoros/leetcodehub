/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    public List<Integer> preorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        if(root == null) return answer;
        answer.add(root.val);
        if(root.children != null){
            root.children.forEach(node -> {
                answer.addAll(preorder(node));
            });
        }
        return answer;
    }
    
}
