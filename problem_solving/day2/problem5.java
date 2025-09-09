// 5)harshad number ex:input:12  output:harshad number(1+2=3,12%3==0 then harshad number )
public class problem5 {
    public static boolean checKHarshad(int n){
        String nValue=String.valueOf(n);
        int sumOfDigits=0;
        for(int i=0;i<nValue.length();i++){
            sumOfDigits+=Character.getNumericValue(nValue.charAt(i));
        }
        if(n%sumOfDigits==0){
            return  true;
        }
        return false;

    }
    public static void main(String[] args) {
        // int n=12;
        int n=49;
        System.out.println("given number is Harshad number:"+checKHarshad(n));
    }
}
