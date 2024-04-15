package G1TBD.LABTBD.services;

import G1TBD.LABTBD.entities.EmergenciaEntity;
import G1TBD.LABTBD.repositories.EmergenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmergenciaService {

    @Autowired
    private EmergenciaRepository emergenciaRepository;

    public EmergenciaEntity crear(EmergenciaEntity emergencia) {
        return emergenciaRepository.crear(emergencia);
    }

    public List<EmergenciaEntity> obtenerTodos() {
        return emergenciaRepository.obtenerTodos();
    }

    public EmergenciaEntity obtenerPorId(long id) {
        return emergenciaRepository.obtenerPorId(id);
    }

    public boolean actualizar(EmergenciaEntity emergencia) {
        return emergenciaRepository.actualizar(emergencia);
    }

    public boolean eliminar(long id) {
        return emergenciaRepository.eliminar(id);
    }
}
