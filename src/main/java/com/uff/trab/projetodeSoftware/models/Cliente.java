package com.uff.trab.projetodeSoftware.models;
import com.uff.trab.projetodeSoftware.repository.ClienteRepositorio;
import com.uff.trab.projetodeSoftware.repository.ReclamacaoRepositorio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente implements ClienteInterface {
    @Id
    private String cpf;
    private int identidade;
    private String email;
    @OneToOne
    private Endereco endereco;
    private boolean prefencial;
    private int pontosAcumulados;
    private Date dataCadastro;

    public boolean ehPreferencial(){
        return this.prefencial;

    }

    @Override
    public boolean trocarPontos(int pontos) {
        if (this.pontosAcumulados>pontos){
            this.pontosAcumulados-=pontos;
//            ClienteRepositorio.atualizarCliente(this);
;           return true;
        }
        return false;
    }

    @Override
    public void realizarReclamacao(String reclamacaoString) {
        Reclamacao reclamacao = new Reclamacao(this,reclamacaoString,new Date());
        ReclamacaoRepositorio.registraReclamacao(reclamacao);
    }

    @Override
    public boolean confirmarIdentificacao() {
        return ehPreferencial();
    }
}
interface ClienteInterface {
    public boolean trocarPontos(int pontos);
    public void realizarReclamacao(String reclamacao);
    public boolean confirmarIdentificacao();
}