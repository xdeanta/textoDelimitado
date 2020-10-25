package textoDelimitado;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PrintWriter pw=null;
        String[] ent=new String[3];
        Product[] pros=new Product[3];
        File f = new File ("productos.txt");
        try {
            pw = new PrintWriter(f);
        }catch(IOException e){
            System.out.println("no se pudo abrir el archivo");
        }
        Product p1 = new Product("cod1","parafusos",3);
        Product p2 = new Product("cod2","cravos",4);
        Product p3 = new Product("cod3","tachas",5);

        ArchManager.escribirArchivo(pw,p1);
        ArchManager.escribirArchivo(pw,p2);
        ArchManager.escribirArchivo(pw,p3);
        pw.close();
        ArchManager.leerArchivo(f,pros);
        for(int i=0;i<3;i++){
            System.out.println(pros[i]);
        }
    }
}
