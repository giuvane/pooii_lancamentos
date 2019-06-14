/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.giuvane.projetofinal.modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.HibernateException;

/**
 *
 * @author Giuvane Conti
 */
public class ConexaoHibernate {
    private static EntityManagerFactory factory;
    private static EntityManager manager;
    
    public static EntityManager getInstance() {
        
        if (manager == null)
        {
            synchronized (ConexaoHibernate.class) {
                if (manager == null)
                {
                    try {
                        factory = Persistence.createEntityManagerFactory("ProjetoFinal");
                        manager = factory.createEntityManager();
                    } catch (HibernateException he) {
                        System.err.println(he.getMessage());
                    }
                }
            }
        }
        
        return manager;
        
    }
    
    public static void close() {
        manager.close();
        factory.close();
    }
    
}
