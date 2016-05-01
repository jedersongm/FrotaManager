/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.shared.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embedded;
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
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue    
    private int cod;
    private String nome;
    private String senha;
    private String email;
    private String celular;
    private String telefoneEmpresa;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    private String sexo;
    private String CPF;
    private String CNH;
    private String categoria;
    private String foto;
    private boolean admin;
    private String cargo;
    @Embedded
    private Endereço endereço;
    @OneToOne(mappedBy = "funcionario")
    private Locacao locação;

    public Funcionario() {
    }

    public Funcionario(int cod, String nome, String senha, String email, String celular, String telefoneEmpresa, Date dataNascimento, String sexo, String CPF, String CNH, String categoria, String foto, boolean admin, String cargo, Endereço endereço, Locacao locação) {
        this.cod = cod;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.celular = celular;
        this.telefoneEmpresa = telefoneEmpresa;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.CPF = CPF;
        this.CNH = CNH;
        this.categoria = categoria;
        this.foto = foto;
        this.admin = admin;
        this.cargo = cargo;
        this.endereço = endereço;
        this.locação = locação;
    }

    

    public Funcionario(long id, int cod, String nome, String senha, String email, String celular, String telefoneEmpresa, Date dataNascimento, String sexo, String CPF, String CNH, String categoria, String foto, String cargo, Endereço endereço, Locacao locação) {
        this.cod = cod;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.celular = celular;
        this.telefoneEmpresa = telefoneEmpresa;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.CPF = CPF;
        this.CNH = CNH;
        this.categoria = categoria;
        this.foto = foto;
        this.cargo = cargo;
        this.endereço = endereço;
        this.locação = locação;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefoneEmpresa() {
        return telefoneEmpresa;
    }

    public void setTelefoneEmpresa(String telefoneEmpresa) {
        this.telefoneEmpresa = telefoneEmpresa;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    public Locacao getLocação() {
        return locação;
    }

    public void setLocação(Locacao locação) {
        this.locação = locação;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.cod;
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
        final Funcionario other = (Funcionario) obj;
        if (this.cod != other.cod) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cod=" + cod + ", nome=" + nome + ", senha=" + senha + ", email=" + email + ", celular=" + celular + ", telefoneEmpresa=" + telefoneEmpresa + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", CPF=" + CPF + ", CNH=" + CNH + ", categoria=" + categoria + ", foto=" + foto + ", admin=" + admin + ", cargo=" + cargo + ", endere\u00e7o=" + endereço + ", loca\u00e7\u00e3o=" + locação + '}';
    }

   
}
