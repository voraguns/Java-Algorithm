class Start {
    public static void main(String[] args) {
        Station first = new Station();
        first.name = "Bang Sue";
        System.out.println(first.name);
        
        Station second = new Station();
        second.name = "Bang Plad";
        
        first.next = second;
        System.out.println(first.name);
        System.out.println(first.next.name);
    }
}

class Station {
    String name;
    double area;
    int staff;
    Station next;
}