package Task_2;

import java.util.Scanner;

public class student_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the MAX marks of the subjects : ");
        int max = sc.nextInt();

        System.out.println("Enter the number of the Subjects : ");
        int no_of_sub = sc.nextInt();

        float[] marks = new float[no_of_sub];
         float total_marks = 0;

        for(int i = 0 ; i< no_of_sub; i++ )
        {
            System.out.println("Enter the marks obtained  in each subject " + (i+1) + ": ");
            marks[i] = sc.nextFloat();
            total_marks  += marks[i] ; 
        }
        double avg_marks = (double)(total_marks/ (max * no_of_sub))*100;

        char grade ;
        if(avg_marks>=90)
        {
            grade= 'A'; 
        }
        else if (avg_marks>=80)
        {
             grade= 'B';
        }
        else if (avg_marks>=70)
        {
             grade = 'C';
        }
        else if (avg_marks>=60)
        {
             grade = 'D';
        }
        else 
        {
             grade = 'E';
        }

        System.out.println("Your marks are : " + total_marks);
        System.out.println("Avg marks are : " + (float)avg_marks +"%");
        System.out.println("The Grade you got is : " + grade);

        sc.close();
    }
}
