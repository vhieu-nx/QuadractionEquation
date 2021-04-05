import java.sql.SQLOutput;
import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation (){

    }
    public QuadraticEquation( double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return a;
    }
    public  double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        return  Math.pow(this.b,2) - 4 * this.a * this.c;
    }
    public void getRoot1(){
        double detal = this.getDiscriminant();
        if (detal > 0){
            System.out.println("Phương trình có nghiệm là: " + ((-this.b + Math.pow(detal,0.5))/(2*this.a)));
        }else if (detal == 0){
            System.out.println("Phương trình có nghiệm kép là: " + (-this.b/(2*this.a)));
        }else {
            System.out.println("phương trình vô nghiệm");
        }
    }
    public void getRoot2(){
        double detal = this.getDiscriminant();
        if (detal > 0){
            System.out.println("Phương trình có nghiệm là: " + ((-this.b - Math.pow(detal,0.5))/(2*this.a)));
        }else if (detal == 0){
            System.out.println("Phương trình có nghiệm kép là: " + (-this.b/(2*this.a)));
        }else {
            System.out.println("phương trình vô nghiệm");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a= ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b= ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c= ");
        double c = scanner.nextDouble();
        QuadraticEquation quanQuadraticEquation = new QuadraticEquation(a,b,c);
//        if (quanQuadraticEquation.getDiscriminant() == 0){
            quanQuadraticEquation.getRoot1();
            quanQuadraticEquation.getRoot2();
//        }
    }

}
