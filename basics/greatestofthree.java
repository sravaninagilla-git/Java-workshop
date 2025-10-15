class greatestofthree {
    public static void main(String[] args) {
        int a = 78, b = 56, c = 92;

        int greatest = Math.max(a, Math.max(b, c));

        System.out.println("Greatest number is: " + greatest);
    }
}
