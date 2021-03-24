public class Passallsubjects {
    //giving grade according to all subjects marks
     public static void main(String[] args) {
         String name="Anna";
         int rollNumber= 2;
         int maths=35;
         int science=45;
         int english=55;
         int total=maths+science+english;
         float percentage=total/3f;

         if (maths>=35 && science>=35 && english>=35){
             if (percentage>=80){
                 System.out.println(name+" roll number"+rollNumber+" pass with Grade A+");
             }
             else if (percentage>=60){
                 System.out.println(name+" roll number "+ rollNumber+" pass with Grade A");
             }
             else if (percentage>=50){
                 System.out.println(name+" roll number "+ rollNumber+ " pass with Grade B");
             }
             else if (percentage>=35){
                 System.out.println(name+" roll number "+ rollNumber+" pass with Grade c");
             }

         }
         else {
             System.out.println(name+" roll number "+ rollNumber + " is fail");
         }

    }
}
