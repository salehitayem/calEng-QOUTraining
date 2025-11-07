import java.util.HashMap;
import java.util.Scanner;

public class Interactive {

    public void executeInteractive() {
        System.out.println("enter operation and two numbers ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        userInput = userInput.toLowerCase();
        String[] parts = userInput.split(" ");
        preformOperation(parts);

    }

    private void preformOperation(String[] parts){
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
    private char opCodeFromString(String opcode){
        char charOp = opcode.charAt(0);
        return charOp;
    }

    private double valueFormWord(String word){
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
        if (map.containsKey(word)) {
            return map.getOrDefault(word, 0);
        } else {
            return Double.parseDouble(word);
        }


    }

    private char getOperator(char op){
        HashMap<Character, Character> map = new HashMap<>();
        map.put('a', '+');
        map.put('s', '-');
        map.put('m', '*');
        map.put('d', '/');

        return map.get(op);
    }
    private void calEn(char operation, double firstval , double secval) {
        switch (operation) {
            case 'a' -> {System.out.println(firstval + secval); break;}
            case 's' -> {System.out.println(firstval - secval);break;}
            case 'm' -> {System.out.println(firstval * secval);break;}
            case 'd' ->{ double res = (secval != 0) ? firstval / secval : 0.0d; System.out.println(res);break;}
            default -> System.out.println("Unknown operation, operations :( additions , subtractions , multiplications , divide )");
        }
    }


}


