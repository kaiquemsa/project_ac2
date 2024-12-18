package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dto.CursoDto;
import service.CursoService;

@RestController
@CrossOrigin
@RequestMapping("/courses")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<CursoDto> listarCursos() {
        return cursoService.listarCursos();
    }

    @PostMapping
    public void salvarCurso(@RequestBody CursoDto cursoDto) {
        cursoService.salvarCurso(cursoDto);
    }

    @DeleteMapping
    public void deletarCurso(@RequestParam Long id) {
        cursoService.deletarCurso(id);
    }

    @PutMapping
    public void atualizarCurso(@RequestParam Long id, @RequestBody CursoDto cursoDto) {
        cursoService.atualizarCurso(id, cursoDto);
    }
}