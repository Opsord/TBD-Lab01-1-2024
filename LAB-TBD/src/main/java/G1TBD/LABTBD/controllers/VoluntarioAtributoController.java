package G1TBD.LABTBD.controllers;

import G1TBD.LABTBD.entities.VoluntarioAtributoEntity;
import G1TBD.LABTBD.services.VoluntarioAtributoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/voluntarioatributo")
@CrossOrigin(origins = "http://localhost:8080/voluntarioatributos")
public class VoluntarioAtributoController {

    @Autowired
    private VoluntarioAtributoService voluntarioAtributoService;

    String homeLinkRedirect = "redirect:/voluntarioatributos";

    @PostMapping("/crear")
    public String crear(VoluntarioAtributoEntity voluntarioAtributo) {
        voluntarioAtributoService.crear(voluntarioAtributo);
        return homeLinkRedirect;
    }

    @GetMapping("/todo")
    public List<VoluntarioAtributoEntity> obtenerTodos() {
        return voluntarioAtributoService.obtenerTodos();
    }

    @GetMapping("/porId")
    public VoluntarioAtributoEntity obtenerPorId(long id) {
        return voluntarioAtributoService.obtenerPorId(id);
    }

    @PostMapping("/actualizar")
    public boolean actualizar(VoluntarioAtributoEntity voluntarioAtributo) {
        return voluntarioAtributoService.actualizar(voluntarioAtributo);
    }

    @PostMapping("/eliminar")
    public boolean eliminar(long id) {
        return voluntarioAtributoService.eliminar(id);
    }
}
