class Main {
    public static void main(String[] args) {


        if (args.length == 0 || args.length != 3) {
            System.err.println("Usage: java Main 2 + 3");
            System.exit(1);
        }
        handleCommandLine(args);


    }

    static void calEn(char operation, double firstval , double secval) {
        switch (operation) {
            case '+' -> {System.out.println(firstval + secval); break;}
            case '-' -> {System.out.println(firstval - secval);break;}
            case '*' -> {System.out.println(firstval * secval);break;}
            case '/' ->{ double res = (secval != 0) ? firstval / secval : 0.0d; System.out.println(res);break;}
            default -> System.out.println("Unknown operation, oporations ( + , *, - , / )");
        }
    }

    private static void handleCommandLine(String[] args) {
        try{
            double firstval =Double.parseDouble(args[0]);
            double secval = Double.parseDouble(args[2]);
            char op = args[1].charAt(0);
            calEn(op, firstval, secval);
        }catch (NumberFormatException e){
            System.err.println("Usage: java Main 2 + 3");
            System.err.println("Usage: java Main val1 oporation val2");
        }
    }
}

