class Start {
    public static void main(String[] args) {
        Station first = new Station();
        first.name = "Bang Sue";
        
        first.next = new Station();
        first.next.name = "Bang Plad";
        
        first.next.next = new Station();
        first.next.next.name = "Talingchan";
        print(first);
    }
    static void print(Station current) {
        if (current == null) return;
        System.out.println(current.name);
        print(current.next);
    }
}

class Station {
    String name;
    Station next;
}