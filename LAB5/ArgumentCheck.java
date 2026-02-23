// User Defined Exception
class CheckArgument extends Exception {
    public CheckArgument(String msg) {
        super(msg);
    }
}

public class ArgumentCheck {

    public static void main(String[] args) {

        try {

            // Check if number of arguments is less than 4
            if (args.length < 4) {
                throw new CheckArgument("CheckArgument");
            }

            int sum = 0;

            // Calculate addition of squares
            for (int i = 0; i < 4; i++) {
                int num = Integer.parseInt(args[i]);
                sum = sum + (num * num);
            }

            System.out.println(sum);
        }
        catch (CheckArgument e) {
            System.out.println("Exception occurred - " + e.getMessage());
        }
    }
}
