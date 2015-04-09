package gdr.connexionhandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class ConnexionHandler {

    public static void main(String[] args) throws IOException, FileNotFoundException, NoSuchAlgorithmException {
        ConnexionL win = new ConnexionL("Connexion locale","Confirmer");
        ConnexionF win2 = new ConnexionF("Connexion par fichier","Confirmer");
        File f = new File("Users.ch");
        UserDB db = new UserDB(f);
    }
}
