public class Salescommission {
    //sale commission in percentage
    public static void main(String[] args) {
        String salesId="Abc1";
        String Name="Mr Ajay";
        int salesAmount=60000;
        int salaryBasic=40000;
        float salesCommission1=salesAmount*35/100f;
        float salesCommission2=salesAmount*20/100f;
        float salesCommission3=salesAmount*10/100f;
        float salesCommission4=salesAmount*5/100f;
        float salesCommission5=salesAmount*2/100f;
        System.out.println("Seller's name is "+Name);
        System.out.println("Seller's ID is "+salesId);

        if (salesAmount>=50000) {
            System.out.println("Sale's commission is "+salesCommission1);//Commission at 35%
        }
       else if (salesAmount>=30000){
            System.out.println("Sale's commission is "+salesCommission2);//Commission at 20%
        }
       else if (salesAmount>=20000){
            System.out.println("Sale's commission is "+salesCommission3);// Commission at 10%
        }
       else if (salesAmount>=10000){
            System.out.println("Sale's commission is "+salesCommission4);// Commission at 5%
        }
       else if (salesAmount<10000){
            System.out.println("Sale's commission is "+salesCommission5);// Commission at 2%
        }


    }
}


