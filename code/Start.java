class Start {
    public static void main(String[] data) {
        int n = 0;
        Queue q = new Queue();
        q.create(1000);
        q.insert("");
        while(true) {
            String current = q.remove();
            if (current == null) break;
            if (current.length() == 5) {
                n++;
                System.out.println(n + ": " + current);
            } else {
                q.insert(current + "W");
                q.insert(current + "D");
                q.insert(current + "L");
            }
        }
    }
}

class Queue {
    String[] data;
    int front = 0;
    int rear = 0;
    void create(int size) {
        data = new String[size];
    }
    void insert(String e) {
        data[rear++] = e;
    }
    String remove() {
        return data[front++];
    }
}