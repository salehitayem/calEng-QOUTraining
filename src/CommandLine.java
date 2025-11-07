public class CommandLine {
    private String[] args;

    public CommandLine(String[] args) {
        this.args = args;
    }

    public void handleCommandLine() {
        try{
            double firstval =Double.parseDouble(args[0]);
            double secval = Double.parseDouble(args[2]);
            char op = args[1].charAt(0);
            //calling the calculator method
            handleCmUi();
            calEnSympol(op, firstval, secval);
        }catch (NumberFormatException e){
            System.err.println("Usage: java Main 2 + 3");
            System.err.println("Usage: java Main val1 oporation val2");
        }
    }
    private void calEnSympol(char operation, double firstval , double secval) {
        switch (operation) {
            case '+' -> {System.out.println(firstval + secval); break;}
            case '-' -> {System.out.println(firstval - secval);break;}
            case 'x' -> {System.out.println(firstval * secval);break;}
            case '/' ->{ double res = (secval != 0) ? firstval / secval : 0.0d; System.out.println(res);break;}
            default -> System.out.println("Unknown operation, operations ( + , x, - , / )");

        }
    }
    private void handleCmUi(){
        System.out.print((Double.parseDouble(args[0]) + " "  + args[1] + " " + Double.parseDouble(args[2]) + " = "));
    }
}
