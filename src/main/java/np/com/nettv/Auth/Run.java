package np.com.nettv.Auth;

import np.com.nettv.Auth.AuthManager;

public class Run {

    public static void main(String[] args)
    {
        AuthManager auth = new AuthManager();

        auth.authenticate("a", "a");
    }
}
