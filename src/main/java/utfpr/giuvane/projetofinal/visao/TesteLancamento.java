/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.giuvane.projetofinal.visao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import utfpr.giuvane.projetofinal.modelo.rn.ClienteRN;
import utfpr.giuvane.projetofinal.modelo.rn.LancamentoRN;
import utfpr.giuvane.projetofinal.modelo.vo.Cliente;
import utfpr.giuvane.projetofinal.modelo.vo.Endereco;
import utfpr.giuvane.projetofinal.modelo.vo.Lancamento;
import utfpr.giuvane.projetofinal.modelo.vo.TipoLancamento;

/**
 *
 * @author Giuvane Conti
 */
public class TesteLancamento {
    public static void main(String[] args) {
        LancamentoRN lancamentoRN = new LancamentoRN();
        
        ClienteRN clienteRN = new ClienteRN();
        
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
        
        Lancamento lancamento = new Lancamento();
        lancamento.setCliente(cliente);
        lancamento.setDataPagamento(LocalDate.now());
        lancamento.setDataVencimento(LocalDate.of(2019, Month.MAY, 31));
        lancamento.setDescricao("Mouse sem fio");
        lancamento.setObservacao("Modelo x...");
        lancamento.setTipo(TipoLancamento.DESPESA);
        lancamento.setValor(new BigDecimal("50.0"));
        
        lancamentoRN.salvar(lancamento);
    }
}
