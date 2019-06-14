/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.giuvane.projetofinal.modelo.dao;

import java.util.List;
import utfpr.giuvane.projetofinal.modelo.vo.Categoria;

/**
 *
 * @author Giuvane Conti
 */
public interface CategoriaDAO {
    void salvar(Categoria categoria);
    
    void atualizar(Categoria categoria);
    
    void excluir(Categoria categoria);
    
    List<Categoria> listarTodos();
    
    List<Categoria> listarTodosCriteria();
    
    List<Categoria> listarFiltroLike(String like);
    
    List<Categoria> listarFiltroLikeCriteria(String like);
    
    Categoria listarUm(Long id);
    
    Categoria listarUmCriteria(Long id);
}
