


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        //
        if (args.length == 1 && args[0].equals("interactive")) {
            executeInteractive();


        }
        else if (args.length == 3) {
            System.out.print((Double.parseDouble(args[0]) + " "  + args[1] + " " + Double.parseDouble(args[2]) + " = "));
            handleCommandLine(args);

        }
        else {
            System.out.println("Usage: java Main interactive or java Main 2 + 3");
        }

    }
    // calculator method working based on attributes
    static void calEn(char operation, double firstval , double secval) {
        switch (operation) {
            case 'a' -> {System.out.println(firstval + secval); break;}
            case 's' -> {System.out.println(firstval - secval);break;}
            case 'm' -> {System.out.println(firstval * secval);break;}
            case 'd' ->{ double res = (secval != 0) ? firstval / secval : 0.0d; System.out.println(res);break;}
            default -> System.out.println("Unknown operation, operations :( additions , subtractions , multiplications , divide )");
        }
    }
    static void calEnSympol(char operation, double firstval , double secval) {
        switch (operation) {
            case '+' -> {System.out.println(firstval + secval); break;}
            case '-' -> {System.out.println(firstval - secval);break;}
            case 'x' -> {System.out.println(firstval * secval);break;}
            case '/' ->{ double res = (secval != 0) ? firstval / secval : 0.0d; System.out.println(res);break;}
            default -> System.out.println("Unknown operation, operations ( + , x, - , / )");
        }
    }
    //handle the inputs
    private static void handleCommandLine(String[] args) {
        try{
            double firstval =Double.parseDouble(args[0]);
            double secval = Double.parseDouble(args[2]);
            char op = args[1].charAt(0);
            //calling the calculator method
            calEnSympol(op, firstval, secval);
        }catch (NumberFormatException e){
            System.err.println("Usage: java Main 2 + 3");
            System.err.println("Usage: java Main val1 oporation val2");
        }
    }


    static char opCodeFromString(String opcode){
        char charOp = opcode.charAt(0);
        return charOp;
    }


    //using hashmap cuz it faster
   static double valueFormWord(String word){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        return map.getOrDefault(word, 0);
    }
    static void executeInteractive() {
        System.out.println("enter operation and two numbers ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        userInput = userInput.toLowerCase();
        String[] parts = userInput.split(" ");
        preformOperation(parts);

    }
    static void preformOperation(String[] parts){
        char Opcode = opCodeFromString(parts[0]);
        double Firstval = valueFormWord(parts[1]);
        double Secval = valueFormWord(parts[2]);
        StringBuilder st = new StringBuilder();
        st.append(Firstval);
        st.append(" ");
        st.append(getOperator(Opcode));
        st.append(" ");
        st.append(Secval);
        System.out.print(st.toString()+ " " + "= ");
        calEn(Opcode, Firstval, Secval);
    }

    static char getSymbol(String op){
        return op.charAt(0);
    }

    static char getOperator(char op){
        HashMap<Character, Character> map = new HashMap<>();
        map.put('a', '+');
        map.put('s', '-');
        map.put('m', '*');
        map.put('d', '/');

        return map.get(op);
    }

}

