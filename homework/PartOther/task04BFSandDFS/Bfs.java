package homework.PartOther.task04BFSandDFS;


import homework.PartMain.task01stack.Queue;


// обход в ширину
public class Bfs {

    public static void main(String[] args) {

    }

    public static void bfs(Node root) {

        if (root == null) {
            return;
        }
        Queue<Node> queue = new Queue<>();
        queue.enqueue(root);

        while (!queue.isEmpty()) {

            Node node = queue.dequeue();

            System.out.print(node.data + " ");

            if (node.left!= null) {
                queue.enqueue(node.left);
            }

            if (node.right!= null) {
                queue.enqueue(node.right);
            }
        }
    }

    public static void bfsRecursive(Node node, Queue<Node> queue) {

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");

        if (node.left != null) {
            queue.enqueue(node.left);
        }

        if (node.right != null) {
            queue.enqueue(node.right);
        }

        if (!queue.isEmpty()) {
            bfsRecursive(queue.dequeue(), queue);
        }
    }

}
