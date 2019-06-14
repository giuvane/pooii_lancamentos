/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.giuvane.projetofinal.modelo.vo;

import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Giuvane Conti
 */
@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa {
    
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long codigo;
    
    //private String nome;
    
    @Embedded
    private Endereco endereco;
    private Boolean ativo;
    
    @OneToMany(mappedBy = "cliente")
    private List<Lancamento> lancamentos;

//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
