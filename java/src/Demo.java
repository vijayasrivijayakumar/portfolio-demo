
    
public class Demo {
    public static void main(String[] args) {
        int[][] mat = {
            {4, 7, 9},
            {2, 6, 8},
            {3, 1, 5}
        };

        
        int cornerSum = mat[0][0] + mat[0][2] + mat[2][0] + mat[2][2];
        int oddCount = 0, evenCount = 0, oddSum = 0, evenSum = 0;
        int min = mat[0][0], max = mat[0][0];
        String primes = "";

    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = mat[i][j];

                
                if (num % 2 == 0) {
                    evenCount++;
                    evenSum += num;
                } else {
                    oddCount++;
                    oddSum += num;
                }

    
                if (num < min) min = num;
                if (num > max) max = num;

                
                if (num == 2 || num == 3 || num == 5 || num == 7) {
                    primes += num + " ";
                }
            }
        }

        
        System.out.println("Corners Sum: " + cornerSum);
        System.out.println("Odd Count: " + oddCount + ", Even Count: " + evenCount);
        System.out.println("Odd Sum: " + oddSum + ", Even Sum: " + evenSum);
        System.out.println("Prime Numbers: " + primes);
        System.out.println("Min: " + min + ", Max: " + max);
        System.out.println("Main Diagonal Sum: " + (mat[0][0] + mat[1][1] + mat[2][2]));
    }
}
