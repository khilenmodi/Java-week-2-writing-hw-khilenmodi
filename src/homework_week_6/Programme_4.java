package homework_week_6;
/**
 * Write a java programme using the following steps.
 * 4.1 Declare two instance and two static variable.
 * 4.2 Declare one instance method
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variable into both instance and static methods
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static method into the main method and run the programme.
 * */

public class Programme_4 {

    //4.1 Declare two instance and two static variables.
    // instance variable
    String name = "prime";
    String surname="Testing";
    //Static variable
    static boolean a = true;
    static boolean b = false;

    //4.2 Declare one instance method.
    //4.4 call the four instance and static variable into both instance and static methods
    //inside the print statement.
    public void instanceMethod(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(Programme_4.a);
        System.out.println(Programme_4.b);
    }
    //4.3 Declare one static method.
    //4.4 call all four instance and static variable into both instance and static method
    // inside the print statement.
    public static void staticMethod(){
        Programme_4 programme_4 = new Programme_4();
        System.out.println(programme_4.name);
        System.out.println(programme_4.surname);
        System.out.println(a);
        System.out.println(b);
    }
    //4.5 Declare the main method.
    //4.6 call both instance and static method into the Main method and run the programme.
    public static void main(String[] args) {
        Programme_4 programme_4 = new Programme_4();
        programme_4.instanceMethod();
        staticMethod();
    }
}
