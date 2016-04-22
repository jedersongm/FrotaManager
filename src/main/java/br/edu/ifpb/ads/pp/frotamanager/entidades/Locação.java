/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.pp.frotamanager.entidades;

import static br.edu.ifpb.ads.pp.frotamanager.entidades.Tools.isPermited;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author jederson
 */
public class Locação {
    
    private Funcionario funcionario;
    private Veiculo veiculo;
    private Integer kmSaida;
    private Date saida;
    private Integer kmChegada;
    private Date chegada;

    public Locação() {
    }

    public Locação(Funcionario funcionario, Veiculo veiculo, Integer kmSaida, Date saida, Integer kmChegada, Date chegada) {
        this.funcionario = funcionario;
        this.veiculo = veiculo;
        this.kmSaida = kmSaida;
        this.saida = saida;
        this.kmChegada = kmChegada;
        this.chegada = chegada;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Integer getKmSaida() {
        return kmSaida;
    }

    public void setKmSaida(Integer kmSaida) {
        this.kmSaida = kmSaida;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Integer getKmChegada() {
        return kmChegada;
    }

    public void setKmChegada(Integer kmChegada) {
        this.kmChegada = kmChegada;
    }

    public Date getChegada() {
        return chegada;
    }

    public void setChegada(Date chegada) {
        this.chegada = chegada;
    }

        
    public boolean categoriaIsPermitid(String categoriaF, String categoriaV){
        if(categoriaV.equals("A")){
            String[] s = categoriaF.split("|");
            return s[0].equals(categoriaV);             
            
        }else{
            if(categoriaF.length() > 1){
                String[] s = categoriaF.split("|");
                return isPermited(s[1], categoriaV);
            }
            return isPermited(categoriaF, categoriaV);
        }
                
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.funcionario);
        hash = 59 * hash + Objects.hashCode(this.veiculo);
        hash = 59 * hash + Objects.hashCode(this.kmSaida);
        hash = 59 * hash + Objects.hashCode(this.saida);
        hash = 59 * hash + Objects.hashCode(this.kmChegada);
        hash = 59 * hash + Objects.hashCode(this.chegada);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Locação other = (Locação) obj;
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        if (!Objects.equals(this.veiculo, other.veiculo)) {
            return false;
        }
        if (!Objects.equals(this.kmSaida, other.kmSaida)) {
            return false;
        }
        if (!Objects.equals(this.saida, other.saida)) {
            return false;
        }
        if (!Objects.equals(this.kmChegada, other.kmChegada)) {
            return false;
        }
        if (!Objects.equals(this.chegada, other.chegada)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Loca\u00e7\u00e3o{" + "funcionario=" + funcionario + ", veiculo=" + veiculo + ", kmSaida=" + kmSaida + ", saida=" + saida + ", kmChegada=" + kmChegada + ", chegada=" + chegada + '}';
    }
    
    
}