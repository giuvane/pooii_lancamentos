/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.giuvane.projetofinal.visao;

import utfpr.giuvane.projetofinal.modelo.dao.generic.GenericDAO;
import utfpr.giuvane.projetofinal.modelo.dao.generic.GenericDAOImpl;
import utfpr.giuvane.projetofinal.modelo.rn.ClienteRN;
import utfpr.giuvane.projetofinal.modelo.vo.Cliente;
import utfpr.giuvane.projetofinal.modelo.vo.Endereco;

/**
 *
 * @author Giuvane Conti
 */
public class TesteCliente {
    public static void main(String[] args) {
        
        ClienteRN clienteRN = new ClienteRN();
        
        GenericDAO<Cliente> genericDao = new GenericDAOImpl<Cliente>();
        
        Endereco end = new Endereco();
        end.setBairro("Centro");
        end.setCep("85892-000");
        end.setComplemento("apto 04");
        end.setEstado("PR");
        end.setLogradouro("Av. Curitiba");
        end.setNumero("681");
        
        Cliente cliente = new Cliente();
        cliente.setEndereco(end);
        cliente.setNome("Giuvane Conti");
        cliente.setAtivo(Boolean.TRUE);
        
        clienteRN.salvar(cliente);
        
        
        
        Cliente cliente2 = new Cliente();
        cliente2.setEndereco(end);
        cliente2.setNome("João");
        cliente2.setAtivo(Boolean.TRUE);
        
        genericDao.save(cliente2);
        
    }
    
}
