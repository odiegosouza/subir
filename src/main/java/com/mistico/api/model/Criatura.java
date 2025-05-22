
package com.mistico.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Criatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String habitat;
    private String poderEspecial;
}
