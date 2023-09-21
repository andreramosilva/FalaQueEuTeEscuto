package com.andre.reviews.FalaQueEuTeEscuto.models;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

public final class Cliente extends Usuario implements Idade {
    private UUID uuid;
    private String nome;
    private String email;
    private LocalDate dataNascimento;

    public Cliente() {
    }

    private UUID gerarUUID() {
        return UUID.randomUUID();
    }

    public Cliente(String nome, String email, LocalDate dataNascimento) {
        this.uuid = gerarUUID();
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    public String toString() {
        return "Cliente{" +
                "uuid=" + uuid +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
