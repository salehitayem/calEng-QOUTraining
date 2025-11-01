class Main {
    public static void main(String[] args) {

        //check for args
        if (args.length == 0 || args.length != 3) {
            System.err.println("Usage: java Main 2 + 3");
            System.exit(1);
        }
        //calling a method todo the job :)
        handleCommandLine(args);


    }
    // calculator method working based on atriputes
    static void calEn(char operation, double firstval , double secval) {
        switch (operation) {
            case '+' -> {System.out.println(firstval + secval); break;}
            case '-' -> {System.out.println(firstval - secval);break;}
            case '*' -> {System.out.println(firstval * secval);break;}
            case '/' ->{ double res = (secval != 0) ? firstval / secval : 0.0d; System.out.println(res);break;}
            default -> System.out.println("Unknown operation, oporations ( + , *, - , / )");
        }
    }
    //handle the inputs
    private static void handleCommandLine(String[] args) {
        try{
            double firstval =Double.parseDouble(args[0]);
            double secval = Double.parseDouble(args[2]);
            char op = args[1].charAt(0);
            //calling the calculator method
            calEn(op, firstval, secval);
        }catch (NumberFormatException e){
            System.err.println("Usage: java Main 2 + 3");
            System.err.println("Usage: java Main val1 oporation val2");
        }
    }
}

