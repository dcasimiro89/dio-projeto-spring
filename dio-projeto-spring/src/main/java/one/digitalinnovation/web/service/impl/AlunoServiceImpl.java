package one.digitalinnovation.web.service.impl;

import one.digitalinnovation.web.model.Aluno;
import one.digitalinnovation.web.repository.AlunoRepository;
import one.digitalinnovation.web.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Iterable<Aluno> buscarTodos() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno buscarPorId(Long id) {
        Optional<Aluno> aluno = alunoRepository.findById(id);
        return aluno.get();
    }

    @Override
    public void inserir(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    @Override
    public void atualizar(Long id, Aluno aluno) {
        Optional<Aluno> alunoBd = alunoRepository.findById(id);
        if (alunoBd.isPresent()) {
            alunoRepository.save(aluno);
        }
    }

    @Override
    public void deletar(Long id) {
        alunoRepository.deleteById(id);
    }

}
