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

    public notizia(String Title, LocalDateTime TimeStamp, String Description, String Author,
                   String Source, String Category)
    {
        this.Title = Title;
        this.TimeStamp = TimeStamp;
        this.Description = Description;
        this.Author = Author;
        this.Source = Source;
        this.Category = Category;
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

    public static ArrayList CreaNotizia(){
        ArrayList <notizia> Notizia = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        try{
            boolean b = true;
            while (b == true){
                System.out.println("inserire titolo");
                String Titolo = input.next();
                LocalDateTime n = LocalDateTime.now();
                System.out.println("inserire descrizione");
                String Descrizione = input.next();
                System.out.println("inserire autore");
                String Autore = input.next();
                System.out.println("inserire fonte");
                String Fonte = input.next();
                System.out.println("inserire categoria");
                String Categoria = input.next();
                Notizia.add(new notizia(Titolo,n,Descrizione,Autore,Fonte,Categoria));
                System.out.println("inserire false per fermare");
                 b = input.nextBoolean();


            }
        }
        catch (Exception e ){
            System.out.println("Errore");
        }
        return Notizia;
    }

    public static void StampaNotizia(ArrayList Notizia){
        for (int i =0; i< Notizia.size();i++){
            System.out.println(Notizia.get(i));
        }

    }

    @Override
    public String toString() {
        return "\nnotizia{" +
                "\nTitle='" + Title + '\'' +
                ", \nTimeStamp=" + TimeStamp +
                ", \nDescription='" + Description + '\'' +
                ", \nAuthor='" + Author + '\'' +
                ", \nSource='" + Source + '\'' +
                ", \nCategory='" + Category + '\'' +
                '}';
    }
}
/*StringBuilder buffer = new StringBuilder();
boolean processedFirst = false;
String firstParam = null, secondParam = null;

try{
    for(String record: arrayList1){
        if(processedFirst)
            buffer.append(",");
        buffer.append(record);
        processedFirst = true;
    }
    firstParam = buffer.toString();
}finally{
    buffer = null;
}
processedFirst = false;
buffer = new StringBuilder();
try{
    for(String record: arrayList2){
        if(processedFirst)
            buffer.append(",");
        buffer.append(record);
        processedFirst = true;
    }
    secondParam = buffer.toString();
}finally{
    buffer = null;
}
secondParam = buffer.toString();

String sql = "INSERT INTO soundsdata.splog (arraylist1, arraylist2) VALUES(?,?)";
try{
    psmt = (PreparedStatement) con.prepareStatement(sql);
    pstmt.setString(1,firstParam);
    pstmt.setString(2,secondParam);
    pstmt.executeUpdate();
}finally {
    pstmt.close();
}*/



