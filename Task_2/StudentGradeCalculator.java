import java.util.*;
public class StudentGradeCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int subjects=sc.nextInt();
        int total=0;

        for(int i=1;i<=subjects;i++){
            System.out.print("Enter marks for subject "+ i + "(out of 100):");
            int marks=sc.nextInt();
            total=total+marks;
        }
        float average=total/subjects;
        char grade;
        if(average>=90){
            grade='A';
        } else if(average>=80){
            grade='B';
        } else if(average>=70){
            grade='C';
        } else if(average>=60){
            grade='D';
        } else {
            grade='F';
        }
        
        System.out.println("Results: ");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + average);
        System.out.println("Grade obtained: " + grade);
    }
}
