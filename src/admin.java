import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class admin extends persona{


    public admin(String Username) {
        super(Username);
    }
    public static void BackupNews(ArrayList Notizia){
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\nites_fcsl\\Desktop\\Informatica\\src\\BackupNotizie.txt");
            for (int i=0; i<Notizia.size();i++){
                myWriter.write(String.valueOf(Notizia.get(i)));
            }
            myWriter.close();
            System.out.println("Scrittura finita");
        }
        catch (IOException e) {
            System.out.println("Errore");
            e.printStackTrace();
        }

    }
    public static void UpdateNews(ArrayList notizia, int index){
        Scanner input = new Scanner(System.in);
        String Titolo;
        LocalDateTime n;
        String Descrizione;
        String Autore;
        String Fonte;
        String Categoria;
        System.out.println("inserire titolo nuovo");
        Titolo = input.next();
        n = LocalDateTime.now();
        System.out.println("inserire descrizione nuova");
        Descrizione = input.next();
        System.out.println("inserire autore nuovo");
        Autore = input.next();
        System.out.println("inserire fonte nuova");
        Fonte = input.next();
        System.out.println("inserire categoria nuova");
        Categoria = input.next();
        notizia.remove(index);
        notizia.add(index,notizia);

    }
    public static void DeleteNews(ArrayList notizia, int index){
        notizia.remove(index);
    }

}
