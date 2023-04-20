class Start {
    public static void main(String[] data) {
        String[] a = { "T", "P", "J", "W", "I", "K", "Z" };
        Engine e = new Engine();
        Node root = e.build(a);
        Queue q = new Queue();
        q.create(a.length + 1);
        q.insert(root);
        while(true) {
            Node current = q.remove();
            if (current == null) break;
            System.out.println(current.name);
            if(current.left != null) {
                q.insert(current.left);
            }
            if(current.right != null) {
                q.insert(current.right);
            }
        }
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


class Queue {
    Node[] data;
    int front = 0, rear = 0;
    void create(int size) {
        data = new Node[size];
    }
    void insert(Node e) {
        data[rear++] = e;
    }
    Node remove() {
        return data[front++];
    }
}

class Node {
    Node left;
    Node right;
    String name;
}