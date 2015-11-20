/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entidades.TipoCampeonato;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Felipe
 */
@Stateless
public class TipoCampeonatoFacade extends AbstractFacade<TipoCampeonato> {
    @PersistenceContext(unitName = "futboleroPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoCampeonatoFacade() {
        super(TipoCampeonato.class);
    }
    
}
