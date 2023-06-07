public class Main {
    static public int sum(int a, int b){
        return a + b;
    }

    static String fizzBuzz(int n){
        return String.valueOf(n);
    }

    static String fizzBuzzDiv(int n){
        String result = "";
        if(n%3 == 0){
            result = "fizz";
        }else if(n%5 == 0){
            result = String.valueOf(n);
        }
        if(n % 5 == 0 && n % 3==0) result = "fizzbuzz";

        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(10, 10));
        System.out.println("Hello worlddd");
        System.out.println(fizzBuzz(10));
        System.out.println(fizzBuzzDiv(3));
        System.out.println(fizzBuzzDiv(15));
    }
}
