package homework.two;

public class homework {
    public static void main(String[] args) {
        String testString = "My test string";
        String _testString = "My name is Iva";

        System.out.println("My name is Iva");
        System.out.println("My last name is Mladzhova");

        //Compare two strings to see if they are the same
        System.out.println(testString.equals(testString + _testString));

        //How many words are in a string?
        String [] stringArray = testString.split(" ");
        System.out.println(testString + " has " + stringArray.length + " word.");

         //Combine two strings into one and write it in the console.
        System.out.println("My test string: "  + "My name is Iva");

    }
}
