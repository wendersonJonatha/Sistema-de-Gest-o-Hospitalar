package Sistema.de.Gestao.Hospitalar.service;

import Sistema.de.Gestao.Hospitalar.model.Paciente;
import Sistema.de.Gestao.Hospitalar.repository.PacienteRepository;

import java.util.List;
import java.util.Optional;

public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public List<Paciente> ListarTodos(){
        return repository.findAll();
    }

    public Optional<Paciente> buscarPeloId(Long id){
        return repository.findById(id);
    }
    public Paciente salvar(Paciente paciente){
        return repository.save(paciente);
    }
    public  void deletar(Long id){
        repository.deleteById(id);
    }
}
