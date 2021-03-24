public class Numbersymbol {
    //adding symbol to number to find value
    public static void calculation(int a, int b,char symbol){
        if (symbol=='+') {
            System.out.println("Addition of a and b is " + (a + b));
        }
        else if (symbol=='-'){
            System.out.println("Subtraction of a and b is "+(a-b));
        }
        else if (symbol=='*') {
            System.out.println("Multiplication of a and b is "+(a*b));

        }
        else if (symbol=='/'){
            System.out.println("Divission of a and b is "+(a/b));
        }
    }
    public static void main(String[] args) {
        //calling method in main method
        calculation(40,15,'+');
        calculation(40,15,'-');
        calculation(40,15,'*');
        calculation(40,15,'/');

    }
}
