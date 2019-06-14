/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.giuvane.projetofinal.modelo.rn;

import java.util.List;
import org.hibernate.HibernateException;
import utfpr.giuvane.projetofinal.modelo.dao.ClienteDAO;
import utfpr.giuvane.projetofinal.modelo.dao.ClienteDAOImpl;
import utfpr.giuvane.projetofinal.modelo.vo.Cliente;

/**
 *
 * @author Giuvane Conti
 */
public class ClienteRN {
    
    private ClienteDAO clienteDao;
    
    public ClienteRN() {
        clienteDao = new ClienteDAOImpl();
    }
    
    public void salvar(Cliente cliente) {
        // Validações antes de salvar categoria
        try {
            clienteDao.salvar(cliente);
        } catch (HibernateException he) {
            System.out.println(he); 
        }
    }
    
    public List<Cliente> listaTodos() {
        return clienteDao.listarTodos();
    }
    
    public Cliente listarUm(Long id) {
        return clienteDao.ListarUm(id);
    }
    
    public List<Cliente> listarFitroLike(String like) {
        return clienteDao.ListarFiltroLike(like);
    }
    
    public void atualizar(Cliente cliente) {
        clienteDao.atualizar(cliente);
    }
    
    public void excluir(Cliente categoria) {
        clienteDao.excluir(categoria);
    }
    
}
