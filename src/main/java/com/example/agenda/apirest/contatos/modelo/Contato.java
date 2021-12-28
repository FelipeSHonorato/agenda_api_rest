package com.example.agenda.apirest.contatos.modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity

public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (nullable = false)
    private String nome;

    @Column (nullable = false)
    private String telefone;

    @Column (nullable = false)
    private String email;

    private  String ulrAvatar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUlrAvatar() {
        return ulrAvatar;
    }

    public void setUlrAvatar(String ulrAvatar) {
        this.ulrAvatar = ulrAvatar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato contato = (Contato) o;
        return id == contato.id;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", ulrAvatar='" + ulrAvatar + '\'' +
                '}';
    }
}
