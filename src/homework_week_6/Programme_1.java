package homework_week_6;

/**
 * write a java programme using the fallowing steps.
 * 1.1 Declare two instance variable.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variable into the instance method inside the print statement.
 * 1.4 Declare the main method.
 * 1.5 call the above instance method into the main method and run the programme.
 */
public class Programme_1 {
    //1.1 Declare two instance variable.
    int a= 10;
    int b =20;

    // 1.2 Declare one instance method.
    //1.3 call both instance variable into instance method inside the print statement
     public void instanceMethod(){
         System.out.println(a);
         System.out.println(b);

     }
        //1.4 Declare the Main Method.
        //1.5 call the above instance method into the main method and run the programme.
        public static void main(String[] args) {
         Programme_1 programme1 = new Programme_1();
         programme1.instanceMethod();
        }

}
