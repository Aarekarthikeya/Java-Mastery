public class StringInternalsDemo {

    public static void main(String[] args) {

        stringPoolDemo();

        stringImmutabilityDemo();

        stringMemoryOptimizationDemo();

        stringBuilderVsStringBufferDemo();

        stringConcatenationDemo();

        unicodeUtf16Demo();

        substringDemo();

        stringBuilderResizingDemo();
    }

    // ==========================================================
    // 1. STRING POOL
    // ==========================================================

    static void stringPoolDemo() {

        System.out.println("\n===== STRING POOL =====");

        String s1 = "Java";
        String s2 = "Java";

        System.out.println("s1 == s2 : " + (s1 == s2));

        String s3 = new String("Java");

        System.out.println("s1 == s3 : " + (s1 == s3));

        String s4 = s3.intern();

        System.out.println("s1 == s4 : " + (s1 == s4));
    }

    // ==========================================================
    // 2. STRING IMMUTABILITY
    // ==========================================================

    static void stringImmutabilityDemo() {

        System.out.println("\n===== STRING IMMUTABILITY =====");

        String s = "Java";

        s.concat(" Spring");

        System.out.println("After concat : " + s);

        s = s.concat(" Spring");

        System.out.println("After reassignment : " + s);
    }

    // ==========================================================
    // 3. MEMORY OPTIMIZATION
    // ==========================================================

    static void stringMemoryOptimizationDemo() {

        System.out.println("\n===== MEMORY OPTIMIZATION =====");

        String s1 = "Google";
        String s2 = "Google";
        String s3 = "Google";

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
    }

    // ==========================================================
    // 4. STRING vs STRINGBUILDER vs STRINGBUFFER
    // ==========================================================

    static void stringBuilderVsStringBufferDemo() {

        System.out.println("\n===== STRING vs STRINGBUILDER vs STRINGBUFFER =====");

        String str = "Java";

        str.concat(" Spring");

        System.out.println("String : " + str);

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Spring");

        System.out.println("StringBuilder : " + sb);

        StringBuffer sbf = new StringBuffer("Java");

        sbf.append(" Spring");

        System.out.println("StringBuffer : " + sbf);
    }

    // ==========================================================
    // 5. CONCATENATION INTERNALS
    // ==========================================================

    static void stringConcatenationDemo() {

        System.out.println("\n===== CONCATENATION =====");

        String a = "Java";
        String b = "Spring";

        String result = a + b;

        System.out.println(result);

        String compileTime = "Java" + "Spring";

        System.out.println(compileTime);

        System.out.println(
                compileTime == "JavaSpring"
        );
    }

    // ==========================================================
    // 6. UNICODE + UTF16
    // ==========================================================

    static void unicodeUtf16Demo() {

        System.out.println("\n===== UTF16 + UNICODE =====");

        char ch = 'A';

        System.out.println((int) ch);

        String hindi = "न";

        System.out.println(
                "Hindi Length : "
                        + hindi.length()
        );

        String emoji = "😀";

        System.out.println(
                "Emoji Length : "
                        + emoji.length()
        );

        System.out.println(
                "Code Point Count : "
                        + emoji.codePointCount(
                        0,
                        emoji.length()
                )
        );
    }

    // ==========================================================
    // 7. SUBSTRING INTERNALS
    // ==========================================================

    static void substringDemo() {

        System.out.println("\n===== SUBSTRING =====");

        String s = "HelloWorld";

        String sub = s.substring(0, 5);

        System.out.println(sub);

        String original = "Java";

        String same = original.substring(
                0,
                original.length()
        );

        System.out.println(
                original == same
        );

        String different =
                original.substring(0, 3);

        System.out.println(
                original == different
        );
    }

    // ==========================================================
    // 8. STRINGBUILDER RESIZING
    // ==========================================================

    static void stringBuilderResizingDemo() {

        System.out.println("\n===== STRINGBUILDER RESIZING =====");

        StringBuilder sb =
                new StringBuilder();

        System.out.println(
                "Initial Capacity : "
                        + sb.capacity()
        );

        for (int i = 1; i <= 20; i++) {

            sb.append("A");

            System.out.println(
                    "Length = "
                            + sb.length()
                            + " Capacity = "
                            + sb.capacity()
            );
        }

        StringBuilder custom =
                new StringBuilder(100);

        System.out.println(
                "Custom Capacity : "
                        + custom.capacity()
        );

        StringBuilder fromString =
                new StringBuilder("Java");

        System.out.println(
                "String Capacity : "
                        + fromString.capacity()
        );
    }
}