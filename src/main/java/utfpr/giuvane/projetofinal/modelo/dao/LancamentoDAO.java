/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.giuvane.projetofinal.modelo.dao;

import java.util.List;
import utfpr.giuvane.projetofinal.modelo.vo.Lancamento;

/**
 *
 * @author Giuvane Conti
 */
public interface LancamentoDAO {
    void salvar(Lancamento categoria);
    
    void atualizar(Lancamento categoria);
    
    void excluir(Lancamento categoria);
    
    List<Lancamento> listarTodos();
    
    Lancamento ListarUm(Long id);
}
