public class Welcome {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error: Please provide exactly one command-line argument");
            System.out.println("Java Welcome vishal");
        } else {
            String name = args[0];
            System.out.println("Welcome " + name); 
        }
    }
}
