package cm.belrose.serviceemploye.controller;

import cm.belrose.serviceemploye.dto.ResponseTemplate;
import cm.belrose.serviceemploye.model.Employe;
import cm.belrose.serviceemploye.service.EmployeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employes")
@Slf4j
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @PostMapping("/")
    public Employe saveEmploye(@RequestBody Employe employe){
        log.info("Inside the saveEmploye of EmployeController");
        return employeService.saveEmploye(employe);
    }

    @GetMapping("/{id}")
    public ResponseTemplate getEmploye(@PathVariable("id") Long employeId){
        return employeService.getEmployeWithDepartment(employeId);
    }
}
