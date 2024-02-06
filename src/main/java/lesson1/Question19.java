package lesson1;

public class Question19 {

    public static class Test{
        void readCard(int cardNo) throws Exception{
            System.out.println("Reading Card");
        }
        void checkCard(int cardNo) throws RuntimeException{
            System.out.println("Checking Card");
        }

        public static void main(String[] args) {
            Test ex = new Test();
            int number = 1122;
//            ex.readCard(number);
            ex.checkCard(number);

        }
    }
}
