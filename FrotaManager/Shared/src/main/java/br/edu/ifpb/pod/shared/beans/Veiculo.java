/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.shared.beans;

import static br.edu.ifpb.pod.shared.beans.Status.LIVRE;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author jederson
 */
@Entity
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue
    private int cod;
    private String fabricante;
    private String modelo;
    private String ano;
    private String placa;
    private String renavan;
    private String cor;
    private String categoria;
    private int km;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Veiculo() {
        this.status = Status.LIVRE;
    }

    public Veiculo(int cod, String fabricante, String modelo, String ano, String placa, String renavan, String cor, String categoria, int km, int status) {
        this.cod = cod;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.renavan = renavan;
        this.cor = cor;
        this.categoria = categoria;
        this.km = km;
        this.status = Status.LIVRE;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.cod;
        hash = 47 * hash + Objects.hashCode(this.fabricante);
        hash = 47 * hash + Objects.hashCode(this.modelo);
        hash = 47 * hash + Objects.hashCode(this.ano);
        hash = 47 * hash + Objects.hashCode(this.placa);
        hash = 47 * hash + Objects.hashCode(this.renavan);
        hash = 47 * hash + Objects.hashCode(this.cor);
        hash = 47 * hash + Objects.hashCode(this.categoria);
        hash = 47 * hash + this.km;
        hash = 47 * hash + Objects.hashCode(this.status);
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
        final Veiculo other = (Veiculo) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.ano, other.ano)) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.renavan, other.renavan)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (this.km != other.km) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        return true;
    }

}
