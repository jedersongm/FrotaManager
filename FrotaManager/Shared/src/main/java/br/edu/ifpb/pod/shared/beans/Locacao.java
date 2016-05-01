/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.shared.beans;

import static br.edu.ifpb.pod.shared.beans.Tools.isPermited;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author jederson
 */
@Entity
public class Locacao implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Funcionario funcionario;
    @OneToOne(cascade = CascadeType.ALL)
    private Veiculo veiculo;
    private Integer kmSaida;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date saida;
    private Integer kmChegada;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date chegada;

    public Locacao() {
    }

    public Locacao(Funcionario funcionario, Veiculo veiculo, Integer kmSaida, Date saida, Integer kmChegada, Date chegada) {
        this.funcionario = funcionario;
        this.veiculo = veiculo;
        this.kmSaida = kmSaida;
        this.saida = saida;
        this.kmChegada = kmChegada;
        this.chegada = chegada;
    }

    public Locacao(long id, Funcionario funcionario, Veiculo veiculo, Integer kmSaida, Date saida, Integer kmChegada, Date chegada) {
        this.id = id;
        this.funcionario = funcionario;
        this.veiculo = veiculo;
        this.kmSaida = kmSaida;
        this.saida = saida;
        this.kmChegada = kmChegada;
        this.chegada = chegada;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public boolean categoriaIsPermitid(String categoriaF, String categoriaV) {
        if (categoriaV.equals("A")) {
            String[] s = categoriaF.split("|");
            return s[0].equals(categoriaV);

        } else {
            if (categoriaF.length() > 1) {
                String[] s = categoriaF.split("|");
                return isPermited(s[1], categoriaV);
            }
            return isPermited(categoriaF, categoriaV);
        }

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Locacao other = (Locacao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }    

}
