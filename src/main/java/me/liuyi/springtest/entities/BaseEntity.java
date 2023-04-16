package me.liuyi.springtest.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class BaseEntity {
    
    @Id
    private Long Id;    
    
    private LocalDateTime createTime;
    
    private LocalDateTime updateTime;

    private Boolean deleted;
}
