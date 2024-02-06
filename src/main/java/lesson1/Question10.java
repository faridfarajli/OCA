package lesson1;

public class Question10 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";

        if (sb.toString().equals(s.toString())){
            System.out.println("Match1");

        }else if (sb.equals(s)){
            System.out.println("Match2");
        }else {
            System.out.println("No Match");
        }
    }
}
