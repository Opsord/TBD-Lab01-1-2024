package G1TBD.LABTBD.services;

import G1TBD.LABTBD.entities.VoluntarioAtributoEntity;
import G1TBD.LABTBD.repositories.VoluntarioAtributoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoluntarioAtributoService {
    @Autowired
    private VoluntarioAtributoRepository voluntarioAtributoRepository;

    public VoluntarioAtributoEntity crearVoluntarioAtributo(VoluntarioAtributoEntity voluntarioAtributo) {
        return voluntarioAtributoRepository.crear(voluntarioAtributo);
    }

    public List<VoluntarioAtributoEntity> obtenerTodosLosVoluntarioAtributo() {
        return voluntarioAtributoRepository.obtenerTodos();
    }

    public VoluntarioAtributoEntity obtenerVoluntarioAtributoPorId(long id) {
        return voluntarioAtributoRepository.obtenerPorId(id);
    }

    public boolean actualizarVoluntarioAtributo(VoluntarioAtributoEntity voluntarioAtributo) {
        return voluntarioAtributoRepository.actualizar(voluntarioAtributo);
    }

    public boolean eliminarVoluntarioAtributo(long id) {
        return voluntarioAtributoRepository.eliminar(id);
    }
}
