class Start {
    public static void main(String[] args) {
        Station first = new Station();
        first.name = "Bang Sue";
        
        first.next = new Station();
        first.next.name = "Bang Plad";
        
        first.next.next = new Station();
        first.next.next.name = "Talingchan";
        
        Station current = first;
        while(current != null) {
            System.out.println(current.name);
            current = current.next;
        }
    }
}

class Station {
    String name;
    double area;
    int staff;
    Station next;
}