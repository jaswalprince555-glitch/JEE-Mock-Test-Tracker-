import java.util.Scanner;
public class MarksTracker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mock Test name:");
        String testname = sc.nextLine();
        System.out.println("Physics socre :");
        int physicsscore = sc.nextInt();

        System.out.println("Chemistry socre :");
        int chemistryscore = sc.nextInt();

        System.out.println("Maths socre :");
        int mathsscore = sc.nextInt();
        sc.nextLine();
    
        System.out.println("Target college :");
        String targetcollege = sc.nextLine();

        int totalmarks = physicsscore + mathsscore + chemistryscore ;
        float percentage = (totalmarks/300.0f)*100 ;


        System.out.println("\n======MockTest======" +testname);
        System.out.println("Physics socre :" + physicsscore);
        System.out.println("chemistry socre :" + chemistryscore);
        System.out.println("maths score:" + mathsscore );
        System.out.println("targeting college:"+ targetcollege);
        System.out.println(" totalmarks :" + totalmarks + "/300");
        System.out.println(" percentage :"+ percentage + "%");
        sc.close();

    }
}
