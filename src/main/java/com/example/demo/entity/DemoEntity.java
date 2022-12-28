package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@Entity(name = "demo")
@AllArgsConstructor
@NoArgsConstructor
public class DemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, insertable = false)
    private Integer id;

    @Column(nullable = false)
    private String text;
}
