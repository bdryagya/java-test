import com.github.bdryagya.Auth.AuthManager;

public class Run {

    public static void main(String[] args)
    {
        AuthManager auth = new AuthManager();

        auth.authenticate("a", "a");
    }
}
