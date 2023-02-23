package gerenciadorPessoas.api.controller;

import gerenciadorPessoas.api.domain.pessoa.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastradosPessoas dados){
        repository.save(new Pessoa(dados));
    }

    @GetMapping
    public List<DadosListarPessoas> listar(){
        return repository.findAll().stream().map(DadosListarPessoas::new).toList();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizaPessoas dados){
        var pessoas = repository.getReferenceById(dados.id());
        pessoas.atualizarInfos(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }



}
