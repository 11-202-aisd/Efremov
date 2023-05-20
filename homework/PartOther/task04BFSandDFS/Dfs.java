package homework.PartOther.task04BFSandDFS;

// обход в глубину
public class Dfs {

    public static void main(String[] args) {

    }

    public static void dfs(Node root, int depth) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }



}
