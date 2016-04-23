/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.pp.frotamanager.entidades;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author jederson
 */
public class Funcionario {
    
    private int cod;
    private String nome;
    private String senha;
    private String email;
    private String celular;
    private String telefoneEmpresa;
    private Date dataNascimento;
    private String sexo;
    private String CPF;
    private String CNH;
    private String categoria;
    private String foto;
    private String cargo;
    private Endereço endereço;

    public Funcionario() {
    }

    public Funcionario(int cod, String nome, String senha, String email, String celular, String telefoneEmpresa, Date dataNascimento, String sexo, String CPF, String CNH, String categoria, String foto, String cargo, Endereço endereço) {
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.cod;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.senha);
        hash = 89 * hash + Objects.hashCode(this.email);
        hash = 89 * hash + Objects.hashCode(this.celular);
        hash = 89 * hash + Objects.hashCode(this.telefoneEmpresa);
        hash = 89 * hash + Objects.hashCode(this.dataNascimento);
        hash = 89 * hash + Objects.hashCode(this.sexo);
        hash = 89 * hash + Objects.hashCode(this.CPF);
        hash = 89 * hash + Objects.hashCode(this.CNH);
        hash = 89 * hash + Objects.hashCode(this.categoria);
        hash = 89 * hash + Objects.hashCode(this.foto);
        hash = 89 * hash + Objects.hashCode(this.cargo);
        hash = 89 * hash + Objects.hashCode(this.endereço);
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
        final Funcionario other = (Funcionario) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        if (!Objects.equals(this.telefoneEmpresa, other.telefoneEmpresa)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        if (!Objects.equals(this.CNH, other.CNH)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.foto, other.foto)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (!Objects.equals(this.endereço, other.endereço)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cod=" + cod + ", nome=" + nome + ", senha=" + senha + ", email=" + email + ", celular=" + celular + ", telefoneEmpresa=" + telefoneEmpresa + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", CPF=" + CPF + ", CNH=" + CNH + ", categoria=" + categoria + ", foto=" + foto + ", cargo=" + cargo + ", endere\u00e7o=" + endereço + '}';
    }

     
    
}