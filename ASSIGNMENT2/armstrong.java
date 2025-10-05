class armstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 10000 are:");
        for (int i = 1; i <= 10000; i++) {
            int sum = 0, num = i;
            int digits = String.valueOf(i).length(); // number of digits
            while (num != 0) {
                int rem = num % 10;
                sum += Math.pow(rem, digits);
                num /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
