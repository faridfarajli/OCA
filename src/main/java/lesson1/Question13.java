package lesson1;

public class Question13 {
    class CD{
        int r;
        CD(int r){
            this.r =r;
        }

    }
    class DVD extends CD{
        int c;
        DVD(int r, int c){
            super(r);
            this.c=c;

        }
    }
}
