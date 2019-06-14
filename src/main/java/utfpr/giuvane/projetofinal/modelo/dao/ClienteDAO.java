/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.giuvane.projetofinal.modelo.dao;

import java.util.List;
import utfpr.giuvane.projetofinal.modelo.vo.Cliente;

/**
 *
 * @author Giuvane Conti
 */
public interface ClienteDAO {
    void salvar(Cliente categoria);
    
    void atualizar(Cliente categoria);
    
    void excluir(Cliente categoria);
    
    List<Cliente> listarTodos();
    
    Cliente ListarUm(Long id);
    
    List<Cliente> ListarFiltroLike(String like);
}
