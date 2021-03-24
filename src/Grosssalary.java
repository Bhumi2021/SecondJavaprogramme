public class Grosssalary {
    //calculating gross salary
     public static void main(String[] args) {
        String ID="Ab123";
        String Name="Elizabeth";
        int basicSalary=20000;
        float HRA=basicSalary*10/100f;
        float TA=basicSalary*8/100f;
        float DA=basicSalary*9/100f;
        float PF=basicSalary*20/100f;
        float grossSalary=basicSalary+HRA+TA+DA-PF;
         System.out.println("Sales Id"+" = "+ID);
         System.out.println("Seller's name"+" = "+Name);
         System.out.println("basicSalary"+" = "+basicSalary);
         System.out.println("HRA"+" = "+HRA);
         System.out.println("TA"+" = "+TA);
         System.out.println("DA"+" = "+DA);
         System.out.println("PF"+" = "+PF);
         System.out.println("grossSalary"+" = "+grossSalary);


    }
}
