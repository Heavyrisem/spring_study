package com.example.demo.service;

import com.example.demo.dto.CreateDemoDto;
import com.example.demo.entity.DemoEntity;
import com.example.demo.repository.DemoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DemoService {
    private final DemoRepository demoRepository;

    public String getDemoText() {
        return "Hello World!";
    }

    public DemoEntity createDemo(CreateDemoDto createDemoDto) {
        DemoEntity demo = createDemoDto.toEntity();
        return this.demoRepository.save(demo);
    }

    public Optional<DemoEntity> getDemoById(Integer id) {
        return this.demoRepository.findById(id);
    }

    public List<Integer> getDemoIdList() {
        List<DemoEntity> list = this.demoRepository.findAll();
        return list.stream().map(DemoEntity::getId).toList();
    }
}
