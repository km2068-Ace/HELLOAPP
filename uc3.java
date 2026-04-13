public class uc3 {

    public static void main(String[] args) {

        String name;

        // Check if any arguments were passed before trying to access them
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}