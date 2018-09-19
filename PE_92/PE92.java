// Author: John Taylor

public class PE92 {
    public static void main(String[] args) {
        int total=0;
        for(int i=1;i<10000000;i++){
            int digitSum=i;
            while(digitSum!=1 & digitSum!=89){
                int n=digitSum;
                digitSum=0;
                while(n!=0){
                    digitSum+=(n%10)*(n%10);
                    n/=10;
                }
            }
            if(digitSum==89){
                total++;
                System.out.println(i);
            }
        }
        System.out.println(total);
    }
}