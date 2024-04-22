package G1TBD.LABTBD.services;

import G1TBD.LABTBD.entities.TareaEntity;
import G1TBD.LABTBD.repositories.TareaRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TareaService {

    @Autowired
    TareaRepositoryImp tareaRepository;

    public TareaEntity crear(TareaEntity tarea) {
        return tareaRepository.crear(tarea);
    }

    public List<TareaEntity> obtenerTodos() {
        return tareaRepository.obtenerTodos();
    }

    public TareaEntity obtenerPorId(long id) {
        return tareaRepository.obtenerPorId(id);
    }

    public List<TareaEntity> obtenerPorIdEmergencia(long id) {
        return tareaRepository.obtenerTareasPorIdEmergencia(id);
    }

    public boolean actualizar(TareaEntity tarea) {
        return tareaRepository.actualizar(tarea);
    }

    public boolean eliminar(long id) {
        return tareaRepository.eliminar(id);
    }

//    public List<TareaEntity> obtenerTareasPorIdEmergencia(UUID idEmergencia){return tareaRepository.obtenerTareasPorIdEmergencia(idEmergencia);}
}
