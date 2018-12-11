/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import ejb.Manufacturer;
import ejb.ManufacturerFacade;
import ejb.Product;
import ejb.ProductCode;
import ejb.ProductCodeFacade;
import ejb.ProductFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Pepe
 */
@WebService(serviceName = "TiendaWS")
public class TiendaWS {

    @EJB
    private ProductCodeFacade ejbPC;// Add business logic below. (Right-click in editor and choose
    @EJB
    private ProductFacade ejbProd;// Add business logic below. (Right-click in editor and choose
    @EJB
    private ManufacturerFacade ejbManufacturer;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create_MNF")
    @Oneway
    public void create_MNF(@WebParam(name = "entity") Manufacturer entity) {
        ejbManufacturer.create(entity);
    }

    @WebMethod(operationName = "edit_MNF")
    @Oneway
    public void edit_MNF(@WebParam(name = "entity") Manufacturer entity) {
        ejbManufacturer.edit(entity);
    }

    @WebMethod(operationName = "remove_MNF")
    @Oneway
    public void remove_MNF(@WebParam(name = "entity") Manufacturer entity) {
        ejbManufacturer.remove(entity);
    }

    @WebMethod(operationName = "find_MNF")
    public Manufacturer find_MNF(@WebParam(name = "id") Object id) {
        return ejbManufacturer.find(id);
    }

    @WebMethod(operationName = "findAll_MNF")
    public List<Manufacturer> findAll_MNF() {
        return ejbManufacturer.findAll();
    }

    @WebMethod(operationName = "findRange_MNF")
    public List<Manufacturer> findRange_MNF(@WebParam(name = "range") int[] range) {
        return ejbManufacturer.findRange(range);
    }

    @WebMethod(operationName = "count_MNF")
    public int count_MNF() {
        return ejbManufacturer.count();
    }
    
    //=========================PRODUCT==============================================
    @WebMethod(operationName = "create_PROD")
    @Oneway
    public void create_PROD(@WebParam(name = "entity") Product entity) {
        ejbProd.create(entity);
    }

    @WebMethod(operationName = "edit_PROD")
    @Oneway
    public void edit_PROD(@WebParam(name = "entity") Product entity) {
        ejbProd.edit(entity);
    }

    @WebMethod(operationName = "remove_PROD")
    @Oneway
    public void remove_PROD(@WebParam(name = "entity") Product entity) {
        ejbProd.remove(entity);
    }

    @WebMethod(operationName = "find_PROD")
    public Product find_PROD(@WebParam(name = "id") Object id) {
        return ejbProd.find(id);
    }

    @WebMethod(operationName = "findAll_PROD")
    public List<Product> findAll_PROD() {
        return ejbProd.findAll();
    }

    @WebMethod(operationName = "findRange_PROD")
    public List<Product> findRange_PROD(@WebParam(name = "range") int[] range) {
        return ejbProd.findRange(range);
    }

    @WebMethod(operationName = "count_PROD")
    public int count_PROD() {
        return ejbProd.count();
    }
    
    @WebMethod(operationName = "fetch")
    public boolean fetch(@WebParam(name = "name") String s, @WebParam(name = "qty") int qty) {
        List<Product> lista = findAll_PROD();
        Product p = null;
        boolean find = false;
        int i = 0;
        while(!find || i < 6){
            p = lista.get(1);
            if(p.getDescription().equals(s))
                find = true;
            i++;
        }
        if(find && p.getQuantityOnHand() >= qty)
            return true;
        else
            return false;
    }
    
    //=========================PRODUCT CODE============================================== 
    
    @WebMethod(operationName = "create_PC")
    @Oneway
    public void create_PC(@WebParam(name = "entity") ProductCode entity) {
        ejbPC.create(entity);
    }

    @WebMethod(operationName = "edit_PC")
    @Oneway
    public void edit_PC(@WebParam(name = "entity") ProductCode entity) {
        ejbPC.edit(entity);
    }

    @WebMethod(operationName = "remove_PC")
    @Oneway
    public void remove_PC(@WebParam(name = "entity") ProductCode entity) {
        ejbPC.remove(entity);
    }

    @WebMethod(operationName = "find_PC")
    public ProductCode find_PC(@WebParam(name = "id") Object id) {
        return ejbPC.find(id);
    }

    @WebMethod(operationName = "findAll_PC")
    public List<ProductCode> findAll_PC() {
        return ejbPC.findAll();
    }

    @WebMethod(operationName = "findRange_PC")
    public List<ProductCode> findRange_PC(@WebParam(name = "range") int[] range) {
        return ejbPC.findRange(range);
    }

    @WebMethod(operationName = "count_PC")
    public int count_PC() {
        return ejbPC.count();
    }

}
