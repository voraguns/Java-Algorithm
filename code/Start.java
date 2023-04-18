class Start {
    public static void main(String[] args) {
        Station first = new Station();
        first.name = "Bang Sue";
        
        first.next = new Station();
        first.next.name = "Bang Plad";
        
        first.next.next = new Station();
        first.next.next.name = "Talingchan";
        
        System.out.println(first.name);
        System.out.println(first.next.name);
        System.out.println(first.next.next.name);
    }
}

class Station {
    String name;
    double area;
    int staff;
    Station next;
}