package ba.unsa.etf.rpr.priprema;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        package ba.unsa.etf.rpr.priprema;

import java.util.Scanner;

        public class Main {
            static public int sumaCifara(int x){
                int c=0, s=0;
                while(x!=0){
                    c=x%10;
                    s+=c;
                    x/=10;
                }
                return s;
            }
            public static void main(String[] args) {
                Scanner ulaz=new Scanner(System.in);
                int x=ulaz.nextInt();
                for(int i=1;i<=x;i++){
                    if(i%sumaCifara(i)==0) System.out.print(i+ " ");
                }
            }
        }
    }
}
