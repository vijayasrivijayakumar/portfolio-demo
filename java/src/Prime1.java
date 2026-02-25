class Prime1 {

    
    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int num = 13;

        int d1 = num / 10;   
        int d2 = num % 10;   

        int p1 = d1 * 10 + d2;  
        int p2 = d2 * 10 + d1; 

        if (isPrime(p1) && isPrime(p2))
            System.out.println(num + " is a Permutation Prime");
        else
            System.out.println(num + " is NOT a Permutation Prime");
    }
}
