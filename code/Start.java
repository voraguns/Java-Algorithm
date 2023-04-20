class Start {
    public static void main(String[] data) {
        String[] a = { "T", "P", "J", "W", "I", "K", "Z" };
        Engine e = new Engine();
        Node root = e.build(a);
        System.out.println(root.right.left.name);
    }
}

class Engine {
    Node build(String[] a) {
        return build(a, 0, a.length - 1);
    }
    Node build(String[] a, int start, int finish) {
        if (start > finish) return null;
        int mid = (start + finish) / 2;
        Node current = new Node();
        current.name = a[mid];
        current.left = build(a, start, mid - 1);
        current.right = build(a, mid + 1, finish);
        return current;
    }
    
    int count(Node c) {
        if (c == null) return 0;
        int a = count(c.left);
        int b = count(c.right);
        return a + b + 1;
    }
}

class Node {
    Node left;
    Node right;
    String name;
}