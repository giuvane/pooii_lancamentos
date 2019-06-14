/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.giuvane.projetofinal.visao;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import utfpr.giuvane.projetofinal.modelo.dao.ConexaoHibernate;
import utfpr.giuvane.projetofinal.modelo.dao.generic.GenericDAO;
import utfpr.giuvane.projetofinal.modelo.dao.generic.GenericDAOImpl;
import utfpr.giuvane.projetofinal.modelo.rn.CategoriaRN;
import utfpr.giuvane.projetofinal.modelo.vo.Categoria;

/**
 *
 * @author Giuvane Conti
 */
public class TesteCategoria {
    public static void main(String[] args) {
        
        CategoriaRN categoriaRN = new CategoriaRN();
        //GenericDAO<Categoria> genericDao = new GenericDAOImpl<Categoria>();
        
        Categoria categoria = new Categoria();
        categoria.setNome("Informática");
        
        List<String> subcategorias = new ArrayList<>();
        subcategorias.add("Sub 1");
        subcategorias.add("Sub 2");
        categoria.setSubCategorias(subcategorias);
        
        categoriaRN.salvar(categoria);
        
//        Categoria categoria2 = new Categoria();
//        categoria2.setNome("Papelaria");
        
        //genericDao.save(categoria2);
        
        //Categoria categoriaRecuperadaFind = manager.find(Categoria.class, 1L);
        Categoria categoriaRecuperadaFind = categoriaRN.listarUm(1L);
        
        categoriaRecuperadaFind.setNome("Informáticaaaaaaaaa");
        
        categoriaRN.atualizar(categoriaRecuperadaFind);
        
        //Query query = manager.createQuery("SELECT c FROM Categoria c");
        List<Categoria> categorias = categoriaRN.listaTodos();
        
        categoriaRN.excluir(categoriaRecuperadaFind);
        
        // Encerra o Manager e o Factory
        ConexaoHibernate.close();
    }
}
