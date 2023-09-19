package supportbank;
public class App {

    public static void main(String[] args) {
        Reader reader = new Reader("Transactions2014.csv");
        reader.printAccounts();
    }
}
