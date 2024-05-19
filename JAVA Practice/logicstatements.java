public class logicstatements {
    public static void main(String[] args) {
        int x = 34;
        int y = 34;

        if (x<y) {
            System.out.println("x is less than y");
        }
        //The if & else statement can be also written in shortcut as
        // String result = (x < y) ? "x is less than y" : "x is greater than y";
        // System.out.println("result");

        else if (x == y) {
            System.out.println("x is equals to y");
        }
        else{
            System.out.println("x is greater than y");
        }

    }
    
}
