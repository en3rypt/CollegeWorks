import java.util.*;

public class ws1 {
    static void p1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Average Wind Speed (in m/s):");
        float v = sc.nextFloat();
        System.out.print("Enter the Operating Efficiency [0...1]:");
        float e = sc.nextFloat();
        System.out.print("Enter the Blade Radius (in meters):");
        float r = sc.nextFloat();
        double A = Math.PI*Math.pow(r,2);
        double p = 0.5*1.2*A*Math.pow(v,3);
        System.out.println("\n\nYou entered an Average Wind Speed of "+v+"m/s.");
        System.out.println("You entered an Operating Efficiency of "+e+" (10.00%).");
        System.out.println("You entered a Blade Radius of 3.00 "+r + " meters.");
        System.out.println("The Maximum Power is "+p+" W and the Actual Power is "+p*e+" W.");
    }
    static void p2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount of Mass:");
        float mass = sc.nextFloat();
        System.out.print("Enter the Age in Years:");
        int age = sc.nextInt();
        System.out.printf("You entered a mass of %.2f and an age of %d years.\n\n",mass,age);
        for(int i=age;i<(age+10);i++){
            double h = Math.pow(i*mass,1.0/4.0);
            System.out.printf("At age %d years, the approximate height of the tree is %.2f meters.\n",i,h);
        }
    }
    static void p3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of inputs:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter current volume:");
            int p1 = sc.nextInt();
            System.out.print("Enter desired volume:");
            int p2 = sc.nextInt();
            System.out.println(Math.abs(p1-p2));
        }
    }

    static void p4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of inputs:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter team A current Score:");
            int Ac = sc.nextInt();
            System.out.print("Enter team B current Score:");
            int Bc = sc.nextInt();
            System.out.print("Enter team A desired Score:");
            int Ad = sc.nextInt();
            System.out.print("Enter team B desired Score:");
            int Bd = sc.nextInt();
            if(Ac - Ad <=0 && Bc-Bd<=0){
                System.out.println("Possible");
            }else{
                System.out.println("Impossible");
            }
        }
    }

    static void p5(){

    }
    public static void main(String[] args){
        p4();
    }
}
