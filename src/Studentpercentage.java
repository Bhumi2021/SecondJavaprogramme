public class Studentpercentage {
    //student grade according to percentage
    public static void main(String[] args){
        String name = "Anna";
        int rollNumber = 2;
        int maths=35;
        int science=45;
        int english=55;
        int total=maths+science+english;
        float percentage=total/3f;

        if (percentage>=35){
            if (percentage>=80){
                System.out.println(name+ " roll number " + rollNumber +" pass with Grade A+");
            }
            else if (percentage>=60){
                System.out.println(name+ " roll numbe r" +rollNumber + " pass with Grade A");
            }
            else if (percentage>=50){
                System.out.println(name+" roll number " +rollNumber + " pass with Grade B");
            }
            else if (percentage>=35){
                System.out.println(name+" roll number " + rollNumber + " pass with Grade C");
            }
        }
        else {
            System.out.println( name+" roll number "+ rollNumber + " is fail");
        }

    }
}
