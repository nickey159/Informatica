import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class notizia {
    public String Title;
    public LocalDateTime TimeStamp;
    public String Description;
    public String Author;
    public String Source;
    public String Category;

    public notizia(String Title, LocalDateTime TimeStamp, String Description, String Author,
                   String Source, String Category) {
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


    public static ArrayList CreaNotizia(int dim) {
        ArrayList<notizia> Notizia = new ArrayList<notizia>(dim);
        Scanner input = new Scanner(System.in);
        String Titolo;
        LocalDateTime n;
        String Descrizione;
        String Autore;
        String Fonte;
        String Categoria;
        for (int i = 0; i < dim; i++) {
            System.out.println("inserire titolo");
            Titolo = input.next();
            n = LocalDateTime.now();
            System.out.println("inserire descrizione");
            Descrizione = input.next();
            System.out.println("inserire autore");
            Autore = input.next();
            System.out.println("inserire fonte");
            Fonte = input.next();
            System.out.println("inserire categoria");
            Categoria = input.next();
            Notizia.add(new notizia(Titolo, n, Descrizione, Autore, Fonte, Categoria));
        }
        return Notizia;
    }

    public static void StampaNotizia(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
    @Override
    public String toString() {
        return "\nnotizia:" +
                "\nTitle=" + Title + " \nTimeStamp=" + TimeStamp +" \nDescription=" + Description +"\nAuthor=" + Author +" \nSource=" + Source +
                " \nCategory=" + Category ;
    }

    public static void FilterNewsByNameAsc(ArrayList Parsed){
        ArrayList<notizia>Notizia = Parsed;
        Collections.sort(Notizia, new Comparator<notizia>() {

            @Override
            public int compare(notizia o1, notizia o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println(Notizia);


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



