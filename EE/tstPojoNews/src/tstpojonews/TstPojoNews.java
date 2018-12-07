/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstpojonews;

/**
 *
 * @author sdist
 */
public class TstPojoNews {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String res, titulo, noticia;
        String strMaq = System.getenv("COMPUTERNAME");

        web.NoticiasWS_Service service = new web.NoticiasWS_Service();
        web.NoticiasWS port = service.getNoticiasWSPort();
        
        
        for (int i = 0; i <= 1000; i++) {
            titulo = "Noticia " + i + " desde: " + strMaq;
            noticia = "JEJEJE: " + i + " de " + strMaq;
            res = port.altaNoticia(titulo, noticia);
        }
    }

    private static String altaNoticia(java.lang.String titulo, java.lang.String noticia) {
        web.NoticiasWS_Service service = new web.NoticiasWS_Service();
        web.NoticiasWS port = service.getNoticiasWSPort();
        return port.altaNoticia(titulo, noticia);
    }
    
    
    
}
