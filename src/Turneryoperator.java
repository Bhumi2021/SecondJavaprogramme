public class Turneryoperator {
    //finding odd even number using turnery operator
    public static void oddEven() {
        int number=11;

        String result = (number % 2 == 0) ? "this number is even" : "this number is odd";

        System.out.println(result);

    }
    public static void main(String[] args){
        oddEven();
    }
}

