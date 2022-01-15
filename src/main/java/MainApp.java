import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class MainApp {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("No se encontro el nombre del archivo");
            System.exit(1);

        }

        String Archivo = args[0];

        FileReader Filereader = null;

        try {
            Filereader = new FileReader(Archivo);

        } catch (FileNotFoundException e){
            System.out.println("No se encontro el nombre del archivo");
            System.exit(2);

        }

        BufferedReader in = new BufferedReader(Filereader);
        String textLine = null;
        int con = 0;

        while (true){
            try {
                if (!((textLine=in.readLine())!=null)) break;
            } catch (IOException e) {
                System.out.println("Error en la lectura del archivo");
                System.exit(3);
            }
            con++;

        }

        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("El archivo "+Archivo+ " tiene " +con+ " lineas");


    }
}
