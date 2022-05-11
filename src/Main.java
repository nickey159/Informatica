import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<notizia>Notizia = notizia.CreaNotizia(2);
        System.out.println(Notizia);
        notizia.FilterNewsByNameAsc(Notizia);

    }
}
