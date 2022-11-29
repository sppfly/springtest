package me.liuyi.springtest.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import me.liuyi.springtest.constants.Constants;

@Data
@Entity
@Table(schema = Constants.SCHEMA)
public class User {
  
    
    @Id
    private Long id;
    
    @NotBlank
    private String name;
    
    @NotBlank
    private String password;
    
    private String avatar;
    
    private String userId;
    
}