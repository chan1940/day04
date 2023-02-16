public class Book {
    private String name;
    private boolean isBorrowed;

    public Book(String name){
        this.name = name;
        this.isBorrowed = false;
    }

    public void print(){
        System.out.println("1. "+getName());
        System.out.println("2. 객체지향");
        System.out.println();
    }

    public void printState(){
        if(isBorrowed() == true){
            System.out.println("대여 중");
        }
        else{
            System.out.println("대여 가능");
        }

    }
    public void borrow( ){
        if(isBorrowed()==false) {
            System.out.println("정상적으로 대여가 완료");
            setBorrowed(true);
        }
        else {
            System.out.println("대여 불가능");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
