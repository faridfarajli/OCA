package lesson1;

public class Question12 {

    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");//AB
        String tb = "C ";
        ta = ta.concat(tb); //ABC
        ta.replace('C','D');
        ta = ta.concat(tb);
        System.out.println(ta);
    }
}
