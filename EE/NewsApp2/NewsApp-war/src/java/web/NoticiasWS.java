/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

// Nuevos imports
import ejb.NewsEntity;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.Queue;
import javax.jms.Connection;
import javax.resource.ResourceException;

/**
 *
 * @author sdist
 */
@WebService(serviceName = "NoticiasWS")
public class NoticiasWS {
    
    @Resource(mappedName="jms/NewMessageFactory") //jms/NewMessageFactory")
    private  javax.jms.ConnectionFactory connectionFactory;

    @Resource(mappedName="java:app/jms/NewMessage")
    private  Queue queue;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "altaNoticia")
    public String altaNoticia(@WebParam(name = "titulo") String titulo, @WebParam(name = "noticia") String noticia) {
        //TODO write your implementation code here:
        
        String res = null;
        
        String title=titulo;
        String body=noticia;
        if ((title!=null) && (body!=null)) 
        {
          try 
          {
            Connection connection = connectionFactory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(queue);

            ObjectMessage message = session.createObjectMessage();
            // here we create NewsEntity, that will be sent in JMS message
            NewsEntity e = new NewsEntity();
            e.setTitle(title);
            e.setBody(body);

            message.setObject(e);                
            messageProducer.send(message);
            messageProducer.close();
            connection.close();
            res = "Alta noticia: " + titulo + ": " + noticia;

           } catch (JMSException ex) 
           {
             ex.printStackTrace();
             res = "AHHHHHHHHHHHHHHH";
           }
        }
        
        return res;
    }
    
    
}
