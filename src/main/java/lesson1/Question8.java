package lesson1;

 class Question8 {
   static class Caller{
        public void init(){
            System.out.println("Initialized");
        }
        private void start(){
            init();
            System.out.println("Started");
        }


            public static void main(String[] args) {
                Caller c = new Caller();
                c.start();// line1
                c.init();// line2


        }
    }
}
