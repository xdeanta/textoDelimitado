package textoDelimitado;

import java.io.*;

public class ArchManager {
    public static void escribirArchivo(PrintWriter pw, Product p){
        pw.println(p.getCodigo() + "\t" + p.getDescripcion() + "\t" + p.getPrecio());
        //pw.close();
    }
    public static void leerArchivo(File f, Product[] pros){
        BufferedReader br=null;
        String[] ent=new String[3];
        try {
            br = new BufferedReader(new FileReader(f));
            for(int i=0;i<3;i++){
                ent=br.readLine().split("\t");
                pros[i]=new Product(ent[0],ent[1],Double.parseDouble(ent[2]));
            }
            br.close();
        }catch (IOException e){
            System.out.println("Hubo un error al abrir el archivo");
        }
    }
}
