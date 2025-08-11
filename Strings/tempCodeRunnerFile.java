

public class strBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder ("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.print(sb);
        // No additional code needed; the output is already as expected.
    }
}
/*
Output:
abcdefghijklmnopqrstuvwxyz
*/