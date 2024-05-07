import java.util.Random;

 class cs {
    public static void main(String[] args) {
        
        int primeCount = 0;
        
        for (int j=0;j<5;j++){
        long start = System.currentTimeMillis();
        System.out.println("Start time " + start);
        for (int i = 0; i < 1000; i++){
            long nanoTime = System.nanoTime();
            
            
            Random random = new Random(nanoTime);
            
            
            int randomNumber = random.nextInt(9000000) + 1000000;
            
            System.out.println(randomNumber);
            if (isPrime(randomNumber)) {
                primeCount++;
            }
        }
   
        long end = System.currentTimeMillis();
        System.out.println("end time " + end);
   }     
        System.out.println("Total prime numbers: " + primeCount);
        System.out.println("Total non prime numbers: " + (1000 - primeCount));
        
    }

    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
