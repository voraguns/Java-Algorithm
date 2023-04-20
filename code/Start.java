class Start {
    public static void main(String[] data) {
        play("");
    }
    static void play(String current) {
        if (current.length() == 5) {
            System.out.println(current);
            return;
        }
        play(current + "W");
        play(current + "D");
        play(current + "L");
    }
}