package np.com.nettv.Auth;

import np.com.nettv.Auth.Interfaces.*;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class AuthManager implements AuthManagerInterface
{
    public static void main(String[] args)
    {
        System.out.println("hello");
    }

    public String authenticate(String mac_address, String password)
    {
        try {
            URL url = new URL("http://bdryagya.com.np/");
            try {
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();


                try {
                    InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                    String data = readStream(in);
                    System.out.println(data);
                } finally {
                    urlConnection.disconnect();
                }
            } catch(IOException e) {}
        } catch (MalformedURLException e) {

        }



        return "Authenticated";
    }

    public String hello()
    {
        return "Hello";
    }

    private String readStream(InputStream is) {
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            int i = is.read();
            while(i != -1) {
                bo.write(i);
                i = is.read();
            }
            return bo.toString();
        } catch (IOException e) {
            return "";
        }
    }
}
