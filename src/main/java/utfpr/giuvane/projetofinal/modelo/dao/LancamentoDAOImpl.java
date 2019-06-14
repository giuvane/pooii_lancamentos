/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.giuvane.projetofinal.modelo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import utfpr.giuvane.projetofinal.modelo.vo.Lancamento;

/**
 *
 * @author Giuvane Conti
 */
public class LancamentoDAOImpl implements LancamentoDAO {

    EntityManager manager;
    
    public LancamentoDAOImpl() {
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void salvar(Lancamento lancamento) {
        manager.getTransaction().begin();
        manager.persist(lancamento);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Lancamento lancamento) {
        manager.getTransaction().begin();
        manager.merge(lancamento);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Lancamento lancamento) {
        manager.getTransaction().begin();
        manager.remove(lancamento);
        manager.getTransaction().commit();
    }

    @Override
    public List<Lancamento> listarTodos() {
        List<Lancamento> lancamentos;
        
        Query query = manager.createQuery("SELECT l FROM Lancamento l");
        lancamentos = query.getResultList();
        
        return lancamentos;
    }

    @Override
    public Lancamento ListarUm(Long id) {
        Lancamento lan;
        
        Query query = manager.createQuery("SELECT l FROM Lancamento l WHERE l.codigo = " + id);
        lan = (Lancamento)query.getSingleResult();
        
        return lan;
    }
    
}
