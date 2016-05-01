/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.shared.beans;

import static br.edu.ifpb.pod.shared.beans.Status.LIVRE;
import java.io.Serializable;
import javax.persistence.Entity;
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
    private int status;

    public Veiculo() {
        this.status = LIVRE;
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
        this.status = LIVRE;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.cod ^ (this.cod >>> 32));
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
        return true;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "cod=" + cod + ", fabricante=" + fabricante + ", modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + ", renavan=" + renavan + ", cor=" + cor + ", categoria=" + categoria + ", km=" + km + ", status=" + status + '}';
    }

}
