package br.com.fiap.abctechapi.controller;


import br.com.fiap.abctechapi.application.AssistApplication;
import br.com.fiap.abctechapi.application.dto.AssistDto;
import br.com.fiap.abctechapi.application.dto.OrderDto;
import br.com.fiap.abctechapi.application.impl.AssistApplicationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/assists")
public class AssistController {

    private final AssistApplication assistApplication;

    @Autowired
    public AssistController(AssistApplication assistApplication) {
        this.assistApplication = assistApplication;
    }

    @GetMapping
    public ResponseEntity<List<AssistDto>> getAssists(){
        List<AssistDto> assistList = this.assistApplication.getAssists();
        return ResponseEntity.ok(assistList);
    }
    @PostMapping
    public ResponseEntity createOrder(@Valid @RequestBody AssistDto assistDto) throws Exception{
        assistApplication.createAssist(assistDto);
        return ResponseEntity.ok().build();
    }
}
