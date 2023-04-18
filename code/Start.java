class Start {
    public static void main(String[] args) {
        Station first = new Station();
        first.name = "Bang Sue";
        
        first.next = new Station();
        first.next.name = "Bang Plad";
        
        first.next.next = new Station();
        first.next.next.name = "Talingchan";
        
        Station current = first;
        for(Station c = first; c != null; c = c.next) {
            System.out.println(c.name);
        }
    }
}

class Station {
    String name;
    double area;
    int staff;
    Station next;
}