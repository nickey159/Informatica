import java.util.ArrayList;

public class persona {
    private String Username;

    public persona(String Username){
        this.Username = Username;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    @Override
    public String toString() {
        return "persona{" +
                "Username='" + Username + '\'' +
                '}';
    }


}
