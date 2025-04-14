public class Methods {
    public static void main (String []args) {
    displayHello();
    dispName();
    int a=5, b=4;
    int result= (getSum(a,b));
    System.out.println(result);
    int c=10;
    int d= 5;
    int e= Minimum(c,d);
    System.out.println("The Minimum number is " + e);
    dotA(3.00);
    }
    static void displayHello() {
    System.out.println("Hello, Universe!");
    }
    static void dispName() {
    String name= "Joms!";
    System.out.println("Hi, " + name);
    }
    static int getSum(int a, int b) {
    return a+b;
    }
    static int Minimum (int c, int d) {
    int answer;
    if (c<d) {
    answer= c; }
    else {
    answer= d;
    }
    return answer;
    }
    static void dotA(double num){
    if (num==1.00) {
    System.out.print("First Blood!");
    }
    else if (num==2.00) {
    System.out.print("Double Kill!");
    }
    else if (num==3.00) {
    System.out.print("Triple Kill!");
    }
    else if (num==4.00) {
    System.out.print("Dominating");
    }
    else {
    System.out.print("You have been killed!");
    }
    }
    }