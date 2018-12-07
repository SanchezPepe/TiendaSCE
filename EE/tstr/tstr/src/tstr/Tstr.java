/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstr;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author sdist
 */
public class Tstr {

    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tstr.NewWebService_Service service = new tstr.NewWebService_Service();
        tstr.NewWebService port = service.getNewWebServicePort();
        
        java.util.List<tstr.NewsEntity> lista = port.findAll();
        lista.forEach((objeto) ->
                System.out.println(objeto)
        );
        
        // Paso 2
        tstr.NewsEntity not;
        not = port.find(new Long(301));
        System.out.println("Res: " + not.getBody());
        
        // Paso 3
        not.setBody(not.getBody() + "modificada");
        edit(not);
        not = port.find(new Long(301));
        System.out.println("edit: " + not.getBody());
        
        // Paso 4
        not = new tstr.NewsEntity();
        Calendar cal = new GregorianCalendar();
        String fecha = cal.get(Calendar.YEAR) +
                cal.get(Calendar.MONTH) +
                cal.get(Calendar.DAY_OF_MONTH) + "";
        
        not.setTitle("noticiaaaa");
        not.setBody("en la fechaaaa " + fecha);
        
        create(not);
       
        lista = port.findAll();
        lista.forEach((objeto) ->
                System.out.println(objeto)
        );
        
    }

    private static java.util.List<tstr.NewsEntity> findAll() {
        tstr.NewWebService_Service service = new tstr.NewWebService_Service();
        tstr.NewWebService port = service.getNewWebServicePort();
        return port.findAll();
    }

    private static void create(tstr.NewsEntity entity) {
        tstr.NewWebService_Service service = new tstr.NewWebService_Service();
        tstr.NewWebService port = service.getNewWebServicePort();
        port.create(entity);
    }

    private static void edit(tstr.NewsEntity entity) {
        tstr.NewWebService_Service service = new tstr.NewWebService_Service();
        tstr.NewWebService port = service.getNewWebServicePort();
        port.edit(entity);
    }

    private static void remove(tstr.NewsEntity entity) {
        tstr.NewWebService_Service service = new tstr.NewWebService_Service();
        tstr.NewWebService port = service.getNewWebServicePort();
        port.remove(entity);
    }
    
}
