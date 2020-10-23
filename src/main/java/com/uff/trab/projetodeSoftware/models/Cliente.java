package com.uff.trab.projetodeSoftware.models;
import com.uff.trab.projetodeSoftware.repository.ClienteRepositorio;
import com.uff.trab.projetodeSoftware.repository.ReclamacaoRepositorio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements ClienteInterface {
    private int cpf;
    private int identidade;
    private String email;
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
            ClienteRepositorio.atualizarCliente(this);
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