package com.uff.trab.projetodeSoftware.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Gerente {
    private Usuario usuario;

    @Override
    public String toString(){
        return this.usuario.toString();
    }
    
}
