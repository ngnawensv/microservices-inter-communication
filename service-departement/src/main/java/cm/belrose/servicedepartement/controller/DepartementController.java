package cm.belrose.servicedepartement.controller;

import cm.belrose.servicedepartement.model.Departement;
import cm.belrose.servicedepartement.service.DepartementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departements")
@Slf4j
public class DepartementController {

    @Autowired
    private DepartementService departementService;

    @PostMapping("/")
    public Departement saveDepartement( @RequestBody Departement departement){
        return departementService.saveDepartement(departement);
    }

    @GetMapping("{id}")
    public Departement findDepartemetById(@PathVariable("id") Long id){
        return departementService.findDepartemetById(id);
    }
}
