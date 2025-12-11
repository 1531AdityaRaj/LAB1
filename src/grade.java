public class grade {
    public static void main(String[]args){
        int marks=88;
        String grade;
        if((marks>=90)&&(marks<=100))
            grade="O";
        else if ((marks>=80)&&(marks<90))
            grade="E";
        else if ((marks>=70)&&(marks<80))
            grade="A";
        else if ((marks>=60)&&(marks<70))
            grade="B";
        else if ((marks>=50)&&(marks<60))
            grade="C";
        else if ((marks>=40)&&(marks<50))
            grade="D";
        else
            grade="F";
        System.out.println("Grade is "+grade);
    }
}
