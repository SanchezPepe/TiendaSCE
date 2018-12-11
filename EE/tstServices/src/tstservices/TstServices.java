/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstservices;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;
import java.util.Random;
import web.Product;

/**
 *
 * @author sdist
 */
public class TstServices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.List<web.Product> lista = findAll();
        
        int prods = count();
        final Product p = new web.Product();
        String s = "";
        System.out.println("PARTE 4.1 ====================================");

        lista.forEach((objProd) -> {
            System.out.println("Producto: + " + objProd.getDescription());
            System.out.println("Fabricante: " + objProd.getManufacturerId().getName());
            System.out.println("Codigo prod: " + objProd.getProductCode().getProdCode() + objProd.getProductCode().getDescription());
            System.out.println("================================");
        });
        
        
        System.out.println("PARTE 4.2 ====================================");
        web.Product prod = lista.get(3);
        int n = prod.getQuantityOnHand();
        System.out.println("Existencia: " + n);
        if(n != 0){
            prod.setQuantityOnHand(n-1);
            System.out.println("Modificación de inventario " + prod.getQuantityOnHand());
        }
        
        System.out.println("PARTE 4.3 ====================================");
        java.util.List<web.Product> lista2 = findAll_1();
        web.Product manu = lista2.get(3);
        manu.getManufacturerId();
        System.out.println("Entidad de fabricante: " + manu.getProductCode());
        
        
        System.out.println("PARTE 4.4 ====================================");
        Random r = new Random();
        //EJERCICIO 4 ALTA DE PRODCUTO
        prod.setProductId(r.nextInt(1500));
        prod.setDescription("ZZZZZ Nuevo Producto");
        create(prod);
        lista.forEach((objProd) -> {
            System.out.println("Producto: + " + objProd.getDescription());
        });
        
        
        
        
        System.out.println("PARTE 4.5 ====================================");
        
        
 
        
        

    }

    private static java.util.List<web.Product> findAll() {
        web.ProductWS_Service service = new web.ProductWS_Service();
        web.ProductWS port = service.getProductWSPort();
        return port.findAll();
    }

    private static int count() {
        web.ProductWS_Service service = new web.ProductWS_Service();
        web.ProductWS port = service.getProductWSPort();
        return port.count();
    }

    private static java.util.List<web.Product> findAll_1() {
        web.ManufacturerWS_Service service = new web.ManufacturerWS_Service();
        web.ManufacturerWS port = service.getManufacturerWSPort();
        return port.findAll();
    }

    private static void create(web.Product entity) {
        web.ProductWS_Service service = new web.ProductWS_Service();
        web.ProductWS port = service.getProductWSPort();
        port.create(entity);
    }
    
    


    
    
    
}
