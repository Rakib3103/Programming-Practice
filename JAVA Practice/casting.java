public class casting {
    public static void main(String[] args) {

        // Widening Casting
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myDouble);
        System.out.println(myInt);

        System.out.println("------------------------------");
        // Narrowing Casting
        double myDOuble = 9.94d;
        int myINt = (int) myDOuble;
        
        System.out.println(myINt);
        System.out.println(myDOuble);
    }
    
}
