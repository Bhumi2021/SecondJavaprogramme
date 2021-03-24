public class Leapyear {
    public static void main(String[] args){
        int year=1989;
        //if leap year divided by 400
        //then is leap year
        if (year% 400 ==0)
            System.out.println(year+" is leap year");
        else {
            System.out.println(year+" is not leap year");
        }
    }

}
