package G1TBD.LABTBD.controllers;

import G1TBD.LABTBD.entities.EmergenciaEntity;
import G1TBD.LABTBD.services.EmergenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080/emergencias")
public class EmergenciaController {

    @Autowired
    private EmergenciaService emergenciaService;

    String homeLinkRedirect = "redirect:/emergencias";

    @PostMapping("/crear")
    public String crearEmergencia(EmergenciaEntity emergencia) {
        emergenciaService.crear(emergencia);
        return homeLinkRedirect;
    }

    @PostMapping("/todo")
    public List<EmergenciaEntity> obtenerTodasLasEmergencias() {
        return emergenciaService.obtenerTodos();
    }

    @PostMapping("/porId")
    public EmergenciaEntity obtenerEmergenciaPorId(long id) {
        return emergenciaService.obtenerPorId(id);
    }

    @PostMapping("/actualizar")
    public boolean actualizarEmergencia(EmergenciaEntity emergencia) {
        return emergenciaService.actualizar(emergencia);
    }

    @PostMapping("/eliminar")
    public boolean eliminarEmergencia(long id) {
        return emergenciaService.eliminar(id);
    }
}
