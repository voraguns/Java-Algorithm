class Start {
    public static void main(String[] data) {
        Player root;
        root = new Player();
        root.name = "Satoshi";
        root.number = 7;
        Player p = new Player();
        p.name = "Frank";
        p.number = 8;
        
        root.left = p;
        root.right = new Player();
        root.right.name = "Michael";
        root.right.number = 10;
        
        Player q = new Player();
        root.left.left = q;
        q.name = "Jordan";
        q.number = 1;
        
        Player r = new Player();
        root.right.left = r;
        r.name = "James";
        r.number = 9;
        
        System.out.println(root.number);
        System.out.println(root.left.number);
        System.out.println(root.right.number);
        System.out.println(q.number);
        System.out.println(r.number);
        
        int t = count(root);
        int ff = sum(root);
        System.out.println("Count node : " + t);
        System.out.println("Sum node : " + ff);
    }
    
    // Count the node in binary tree
    static int count(Player x) {
        if (x == null) return 0;
        int a = count(x.left);
        int b = count(x.right);
        return a + b + 1;
    }
    
    static int sum(Player x) {
        if (x == null) return 0;
        int a = sum(x.left);
        int b = sum(x.right);
        int c = x.number;
        return a + b + c;
    }
}

class Player {
    String name;
    int number;
    Player left;
    Player right;
}