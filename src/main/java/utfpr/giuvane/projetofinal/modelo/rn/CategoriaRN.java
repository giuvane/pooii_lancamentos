/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.giuvane.projetofinal.modelo.rn;

import java.util.List;
import org.hibernate.HibernateException;
import utfpr.giuvane.projetofinal.modelo.dao.CategoriaDAO;
import utfpr.giuvane.projetofinal.modelo.dao.CategoriaDAOImpl;
import utfpr.giuvane.projetofinal.modelo.vo.Categoria;

/**
 *
 * @author Giuvane Conti
 */
public class CategoriaRN {
    
    private CategoriaDAO categoriaDao;
    
    public CategoriaRN() {
        categoriaDao = new CategoriaDAOImpl();
    }
        
    
    public void salvar(Categoria categoria) {
        // Validações antes de salvar categoria
        try {
            categoriaDao.salvar(categoria);
        } catch (HibernateException he) {
            System.out.println(he);
            
        }
        
    }
    
    public List<Categoria> listaFiltroLike(String like) {
        return categoriaDao.listarFiltroLikeCriteria(like);
    }
    
    public List<Categoria> listaTodos() {
        return categoriaDao.listarTodos();
    }
    
    public Categoria listarUm(Long id) {
        return categoriaDao.listarUm(id);
    }
    
    public void excluir(Categoria categoria) {
        categoriaDao.excluir(categoria);
    }
    
    public void atualizar(Categoria categoria) {
        categoriaDao.atualizar(categoria);
    }
        
}
