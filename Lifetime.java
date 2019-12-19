class Lifetime {
    public static void main(String ars[]) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = 7;
            System.out.println("y is: " + y);
            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}