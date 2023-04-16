package me.liuyi.springtest.entities;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import me.liuyi.springtest.constants.Constants;

@Data
@Entity
@Table(schema = Constants.SCHEMA)
public class User extends BaseEntity{
  
    
    @NotBlank
    private String name;
    
    @NotBlank
    private String password;
    
    private String avatar;
    
    private String userId;

    @OneToMany
    private List<Community> Communities;

    private List<Post> posts;    
    
}