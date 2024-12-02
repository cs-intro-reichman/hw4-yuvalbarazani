public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        int p = 2;
        boolean[] arr=new boolean[N];
        arr[0]= true;
        arr[1]=true;
         
        while(p <= Math.sqrt(N)){
            
            for(int i = 0;i<N;i++){
                if(i % p == 0 && i != p)
                    arr[i]=true;
            }
            p++;

            while(p<Math.sqrt(N) && arr[p])
            {
                p++;
            }
        }

        System.out.println("Prime numbers up to " + N + ":");
        for(int i=0;i<N;i++){

            if(!arr[i]){
                System.out.println(i);
            }          
        }
    }
}