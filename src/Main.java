import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>(Arrays.asList(
           new Book("클린코드"),
           new Book("객체지향"),
           new Book("TDD")
        ));

        while(true){
            System.out.println("대여할 책 번호 입력.");
            for(int i = 0; i<books.size();i++){
                System.out.print((i+1)+". "+books.get(i).getName()+ " - ");
                books.get(i).printState();
            }
            int num = sc.nextInt()-1;
            if(num<1 || num>3){
                System.out.println("종료!!!");
                break;
            }
            books.get(num).borrow();

        }

    }
}