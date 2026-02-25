class Prime2 {
    public static void main(String[] args) {

        int n = 5;      
        int count = 0;
        int num = 1;

        while (count < n) {
            num++;

            int factors = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factors++;
                }
            }

            if (factors == 2) { 
                count++;
            }
        }

        System.out.println(n + "th Prime Number is: " + num);
    }
}
