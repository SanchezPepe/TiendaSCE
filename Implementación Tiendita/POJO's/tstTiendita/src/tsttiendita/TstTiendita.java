/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsttiendita;

/**
 *
 * @author sdist
 */
public class TstTiendita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int customerID = 1;
        int productID = 980005;
        int qty = 5;
        
        String resp = tienditaWSDLOperation(customerID, productID, qty);
        
        System.out.println("RESULTADO: " + resp);
    }

    private static String tienditaWSDLOperation(int customerID, int productID, int quantity) {
        org.netbeans.j2ee.wsdl.tiendita.descriptorwsdl.tienditawsdl.TienditaWSDLService service = new org.netbeans.j2ee.wsdl.tiendita.descriptorwsdl.tienditawsdl.TienditaWSDLService();
        org.netbeans.j2ee.wsdl.tiendita.descriptorwsdl.tienditawsdl.TienditaWSDLPortType port = service.getTienditaWSDLPort();
        return port.tienditaWSDLOperation(customerID, productID, quantity);
    }
    
    
    
}
