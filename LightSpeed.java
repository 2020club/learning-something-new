class LightSpeed {
    public static void main(String args[]) {
        int lspeed;
        long days;
        long seconds;
        long distance;

        lspeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lspeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");
    }
}