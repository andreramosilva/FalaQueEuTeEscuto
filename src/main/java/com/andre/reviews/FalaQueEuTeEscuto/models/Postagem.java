package com.andre.reviews.FalaQueEuTeEscuto.models;

import java.time.LocalDate;
import java.util.List;

public sealed class Postagem permits Reclamacao, Elogio {
    LocalDate data;
    String Post;
    //int curtidas;
    List<Curtida> curtidas;
    
}
