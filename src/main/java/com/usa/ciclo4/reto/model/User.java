//Reto 1 Ciclo 4

package com.usa.ciclo4.reto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 *
 * @author Sebastián
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name ="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String  email;
    private String  password;
    private String  name;
}
