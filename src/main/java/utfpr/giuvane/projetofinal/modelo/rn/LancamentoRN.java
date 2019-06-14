/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.giuvane.projetofinal.modelo.rn;

import java.util.List;
import org.hibernate.HibernateException;
import utfpr.giuvane.projetofinal.modelo.dao.LancamentoDAO;
import utfpr.giuvane.projetofinal.modelo.dao.LancamentoDAOImpl;
import utfpr.giuvane.projetofinal.modelo.vo.Lancamento;

/**
 *
 * @author Giuvane Conti
 */
public class LancamentoRN {
    private LancamentoDAO lancamentoDao;
    
    public LancamentoRN() {
        lancamentoDao = new LancamentoDAOImpl();
    }
    
    public void salvar(Lancamento lancamento) {
        // Validações antes de salvar categoria
        try {
            lancamentoDao.salvar(lancamento);
        } catch (HibernateException he) {
            System.out.println(he);   
        } 
    }
    
    public void atualizar(Lancamento cliente) {
        lancamentoDao.atualizar(cliente);
    }
    
    public List<Lancamento> listaTodos() {
        return lancamentoDao.listarTodos();
    }
    
    public Lancamento listarUm(Long id) {
        return lancamentoDao.ListarUm(id);
    }
    
    public void excluir(Lancamento categoria) {
        lancamentoDao.excluir(categoria);
    }
}
