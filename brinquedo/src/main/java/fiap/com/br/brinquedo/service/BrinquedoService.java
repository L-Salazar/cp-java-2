package fiap.com.br.brinquedo.service;

import fiap.com.br.brinquedo.model.Brinquedo;
import fiap.com.br.brinquedo.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrinquedoService {

    @Autowired
    private BrinquedoRepository repository;

    public Brinquedo salvar(Brinquedo brinquedo) {
        return repository.save(brinquedo);
    }

    public List<Brinquedo> listarTodos() {
        return repository.findAll();
    }

    public Brinquedo atualizar(Long id, Brinquedo brinquedoAtualizado) {
        Brinquedo existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setNome(brinquedoAtualizado.getNome());
            existente.setTipo(brinquedoAtualizado.getTipo());
            existente.setClassificacao(brinquedoAtualizado.getClassificacao());
            existente.setTamanho(brinquedoAtualizado.getTamanho());
            existente.setPreco(brinquedoAtualizado.getPreco());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
