package Lab6;
class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}
public class lab6_5 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Exception occurred - CheckArgument");
            }

            int sum = 0;
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                sum += num * num; // Adding square of the number
            }

            System.out.println(sum);
        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter integers only.");
        }
    }
}
