class oddoreven {
    public static void main(String[] args) {
        int num = 37;

        String[] result = { "Even", "Odd" };
        System.out.println(num + " is " + result[num & 1]);
    }
}
