package lesson1;

public class Question11 {

    interface  Readable{
        public void readBook();
        public void setBookMark();
    }
    abstract class Book implements Readable{
        public void readBook(){}
    }

    class Ebook extends Book{

        public void readBook(){}

        public void setBookMark() {


            Book book = new Ebook();
            book.readBook();

        }


    }

}
