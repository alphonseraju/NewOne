package daliycodes;
public class StringBufferStringBuilderExample {
    public static void main(String[] args) {
        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        String resultBuffer = stringBuffer.toString();
        System.out.println("StringBuffer Result: " + resultBuffer);

        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        String resultBuilder = stringBuilder.toString();
        System.out.println("StringBuilder Result: " + resultBuilder);

        // Inserting into StringBuilder
        stringBuilder.insert(5, "Beautiful ");
        System.out.println("Updated StringBuilder: " + stringBuilder);

        // Deleting from StringBuffer
        stringBuffer.delete(0, 5);
        System.out.println("Updated StringBuffer: " + stringBuffer);

        // Reversing StringBuilder
        stringBuilder.reverse();
        System.out.println("Reversed StringBuilder: " + stringBuilder);
    }
}
