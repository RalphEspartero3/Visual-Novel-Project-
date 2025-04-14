import java.io.*;
public class Numsorting {

    
        public static InputStreamReader reader= new InputStreamReader(System.in);
        public static BufferedReader in= new BufferedReader (reader);
        public static void main (String[]args) throws Exception {
            int Num[]= new int[5];
            for (int a=0; a<Num.length; a++) {
                System.out.print("Enter five numbers: ");
    
        }
            System.out.println("Array List: ");
            for (int b=0; b<5; b++) {
            System.out.print(Num[b] + " ");
        }
            int temp=0;
            System.out.println();
            System.out.println("Sorted Array");
            for (int d=0; d<Num.length; d++ ) {
                for (int c=0; c<Num.length-1; c++) {
                if (Num[c]>Num[c+1]) {
                temp= Num[c];
                Num[c]= Num[c+1];
                Num[c+1]= temp;
                }
             }
         }
                for (int e=0; e<5; e++) {
                    System.out.print(Num[e] + " ");
            } 
        }
    }
    
    

