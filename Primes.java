public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        int p = 2;
        boolean[] arr=new boolean[N+1];
        arr[0]= true;
        arr[1]=true;
        int primeCount = N-1;// not icluding 0 and 1
         
        while(p <= Math.sqrt(N)){
            
            for(int i = 0;i<N+1;i++){
                if(i % p == 0 && i != p){// check if the number is not prime 
                     if(arr[i] == false){ // important to not count the same number multiple times
                        primeCount--;
                        arr[i]=true;
                    }
                }
            }
            p++;

            while(p<Math.sqrt(N) && arr[p])
            {
                p++;
            }
        }

        System.out.println("Prime numbers up to " + N + ":");
        for(int i=0;i<N+1;i++){

            if(!arr[i]){
                System.out.println(i);
            }          
        }
        int percentage = (int)(primeCount/(double)N *100);
        System.out.println("There are " + primeCount + " primes between 2 and " + N + " (" + percentage + "% are primes)");
    }
}
