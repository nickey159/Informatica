import java.io.FileWriter;
import java.io.IOException;

public class admin extends persona{


    public admin(String Username) {
        super(Username);
    }
    public static void BackupNews(){
        try {
            FileWriter myWriter = new FileWriter("\"C:\\Users\\nites_fcsl\\Desktop\\Informatica\\Backup.txt");
            myWriter.write("");
            myWriter.close();
            System.out.println("Scrittura finita");
        }
        catch (IOException e) {
            System.out.println("Errore");
            e.printStackTrace();
        }

    }

}
