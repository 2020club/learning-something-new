class IfSample {
    public static void main(String args[]) {
        int x, y;

        x = 10;
        y = 20;

        if(x < y) System.out.println("x is less than y");

        x = x * 2;
        if(x == y) System.out.println("x now equal to y");

        x = x * 2;
        if(x > y) System.out.println("x now greater than y");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        if(x == y) System.out.println("not going to see this.");
    }
}