package lesson1;

public class Question6 {

    abstract class Planet{

        protected void revolve(){  //line 1

        }

        abstract void rotate();   //line 2
    }

    class Earth extends Planet{

      public    void revolve(){  //line 3 // public v' ya prodected
        }

        protected void rotate(){  //line 4

        }

    }
}
