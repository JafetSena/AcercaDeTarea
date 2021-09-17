public class App {
    public static void main(String[] args) throws Exception {
        //Jafet Anselmo Sena Ramos 3A ISC 20100264

        int x = 0, y = 1, Suma = 0, i = 0;

        while(i<10)
        {
            Suma = x + y;
            System.out.println(Suma);
            x = y;
            y = Suma;
            i++;
        }
    }
}
