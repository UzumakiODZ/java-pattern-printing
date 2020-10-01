package com.company;
import java.util.Scanner;

public class exersise_1 {
    public static void main(String[] args){
System.out.println("cbse exam result program:-");
        Scanner s=new Scanner(System.in);
        System.out.println("marks of Hindi :- ");
        int Hindi=s.nextInt();
        System.out.println("marks of English :- ");
        int English=s.nextInt();
        System.out.println("marks of Maths :- ");
        int Maths=s.nextInt();
        System.out.println("marks of Computer :- ");
        int Computer=s.nextInt();
        System.out.println("marks of Science :- ");
        int Science=s.nextInt();
        System.out.println("Total marks are out of Hundred :- ");
        float Total_marks=(Hindi+English+Maths+Computer+Science);
        System.out.println(Total_marks);
        System.out.println("Total percentage :-");
        float Total_prcentage=(Total_marks*100/500);
        
        System.out.println(Total_prcentage);
    }

}
