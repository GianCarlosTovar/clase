/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entidades.Inventario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jcarlos
 */
@Stateless
public class InventarioFacade extends AbstractFacade<Inventario> {

    @PersistenceContext(unitName = "CrudProyectoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InventarioFacade() {
        super(Inventario.class);
    }
    
}
