public class HelloWorld {
public static void main (String[] args){

System.out.println("Hello World!");

int age = 20;
double marks = 85.5;
char grade = 'A';
Boolean pass = true;

System.out.println("Age: " + age);
System.out.println("Marks: " + marks);
System.out.println("Grade: " + grade);
System.out.println("Pass: " + pass);

double num = age;
int value = (int) marks;

System.out.println("Implicit Casting: " + num);
System.out.println("Explicit Casting: " + value);

}
}
