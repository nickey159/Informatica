import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class notizia {
    private String Title;
    private LocalDateTime TimeStamp;
    private String Description;
    private String Author;
    private String Source;
    private String Category;
    //private Country Country;

    public notizia(String Title, LocalDateTime TimeStamp, String Description, String Author,
                   String Source, String Category)
    {
        this.Title = Title;
        this.TimeStamp = TimeStamp;
        this.Description = Description;
        this.Author = Author;
        this.Source = Source;
        this.Category = Category;
        //this.Country = Country;
    }
    public static void CreaNotizia(){
        String Title;
        LocalDateTime TimeStamp;
        String Description;
        String Author;
        String Source;
        String Category;
        //Country Country;
        Scanner input = new Scanner(System.in);
        try{

            ArrayList<notizia> lista = new ArrayList<>();

            System.out.println("Inserire il titolo");
            Title= input.next();
            TimeStamp= LocalDateTime.now();
            System.out.println("Inserire descrizione");
            Description=input.next();
            System.out.println("Inserire autore");
            Author=input.next();
            System.out.println("Inserire la fonte");
            Source= input.next();
            System.out.println("Inserire la categoria");
            Category= input.next();

            lista.add(new notizia(Title,TimeStamp,Description,Author,Source,Category));





        }
        catch(Exception e ){
            System.out.println("Errore");

        }




    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public LocalDateTime getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        TimeStamp = timeStamp;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }



    @Override
    public String toString() {
        return "notizia{" +
                "\nTitle='" + Title + '\'' +
                "\n TimeStamp=" + TimeStamp +
                "\n Description='" + Description + '\'' +
                "\nAuthor='" + Author + '\'' +
                "\n Source='" + Source + '\'' +
                "\n Category='" + Category + '\'' +
                "\n Country=" + Country +
                '}';
    }
}



