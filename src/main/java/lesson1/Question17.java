package lesson1;

public class Question17 {

    public static class CheckingAmount{
        public int amount;
        public CheckingAmount(int amount){
             this.amount=amount;
         }

         public int getAmount(){
            return amount;
         }
         public void setAmount(int amount){
            this.amount=amount;

         }

         public void changeAmount(int x){
                amount += x;
         }

    }

    public static void main(String[] args) {
        CheckingAmount  x = new CheckingAmount((int) (Math.random()*1000));

        System.out.println(x.getAmount());//0
    }
}
