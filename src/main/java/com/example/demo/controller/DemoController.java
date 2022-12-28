package com.example.demo.controller;


import com.example.demo.dto.CreateDemoDto;
import com.example.demo.entity.DemoEntity;
import com.example.demo.service.DemoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/demo") // localhost:8080/demo
public class DemoController {
    private final DemoService demoService;

    @GetMapping("/text") // GET localhost:8080/demo/text -> Hello World!
    public String getDemoText() {
        return this.demoService.getDemoText();
    }

    @PostMapping("/create")
    public DemoEntity createDemo(@RequestBody @Valid CreateDemoDto createDemoDto) {
        log.info("createDemoDto: {}", createDemoDto);
        return this.demoService.createDemo(createDemoDto);
    }

    @GetMapping("/{id}") // GET localhost:8080/demo/2
    public Optional<DemoEntity> getDemo(@PathVariable Integer id) {
        return this.demoService.getDemoById(id);
    }

    @GetMapping("/list")
    public List<Integer> getDemoIdList() {
        return this.demoService.getDemoIdList();
    }
}
