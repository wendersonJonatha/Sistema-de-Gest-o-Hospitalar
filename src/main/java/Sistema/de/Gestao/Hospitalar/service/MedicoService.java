package Sistema.de.Gestao.Hospitalar.service;

import Sistema.de.Gestao.Hospitalar.model.Medico;
import Sistema.de.Gestao.Hospitalar.repository.MedicoRepository;

import java.util.List;
import java.util.Optional;

public class MedicoService {

    private final MedicoRepository repository;

    public MedicoService(MedicoRepository repository) {
        this.repository = repository;
    }

    public List<Medico> listarTodos(){
        return repository.findAll();
    }
    public Optional<Medico> buscarPeloId(Long id){
        return  repository.findById(id);
    }
    public Medico salvar(Medico medico){
        return repository.save(medico);
    }
    public void deletar(Long id){
        repository.deleteById(id);
    }
}
