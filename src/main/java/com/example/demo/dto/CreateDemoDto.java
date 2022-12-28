package com.example.demo.dto;

import com.example.demo.entity.DemoEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateDemoDto {
    @NotBlank(message = "text field is required")
    private String text;

    public DemoEntity toEntity() {
        return DemoEntity.builder().text(this.getText()).build();
    }
}
