class Main {
    public static void main(String[] args) {

        if (args.length == 1 && args[0].equals("interactive")) {
            Interactive obj1 = new Interactive();
            obj1.executeInteractive();
        }
        else if (args.length == 3) {

            CommandLine obj2 = new CommandLine(args);
            obj2.handleCommandLine();

        }
        else {
            System.out.println("Usage: java Main interactive or java Main 2 + 3");
        }

        Object[] werwer = new Object[3];


//        werwer[0] = new Interactive();
//        werwer[1] = new CommandLine(args);
//        werwer[2] = "string class :P";
//
//        ((Interactive) werwer[0]).executeInteractive();
    }
}

