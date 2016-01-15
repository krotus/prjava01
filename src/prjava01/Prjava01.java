package prjava01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author andreu
 */
public class Prjava01 {
    public static void main(String[] args) throws IOException {
        File f = new File("fitxer00.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write("  <head>");bw.newLine();
            bw.write("    <title>");bw.newLine();
            bw.write("      Nova pagina web");bw.newLine();
            bw.write("    </title>");bw.newLine();
            bw.write("  </head>");bw.newLine();
            bw.write(" <h1>DAW2 m08uf4pr2</h1>");bw.newLine();
            bw.write("  <body>");bw.newLine();
            bw.write("    <h1>DAW2 M09 UF4 PR3</h1>");bw.newLine();
            bw.write("    Nova pagina web");bw.newLine();
            bw.write("  </body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.close();
        }
    }
    
}
