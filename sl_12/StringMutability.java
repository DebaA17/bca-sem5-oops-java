public class StringMutability {
    public static void main(String[] args) {
        String text = "Java";
        String changedText = text.concat(" Language");

        StringBuffer buffer = new StringBuffer("Java");
        buffer.append(" Language");

        StringBuilder builder = new StringBuilder("Java");
        builder.append(" Language");

        System.out.println("Original String: " + text);
        System.out.println("New String after concat: " + changedText);
        System.out.println("String remains unchanged: " + text);
        System.out.println("Mutable StringBuffer: " + buffer);
        System.out.println("Mutable StringBuilder: " + builder);
    }
}