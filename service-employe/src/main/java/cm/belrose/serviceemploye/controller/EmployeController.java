package cm.belrose.serviceemploye.controller;

import cm.belrose.serviceemploye.dto.ResponseTemplate;
import cm.belrose.serviceemploye.model.Employe;
import cm.belrose.serviceemploye.service.EmployeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employes")
@Slf4j
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @Operation(summary = "Enregistrer un employe dans la  la base de données")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Enregistrement avec succès!!!",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Echec d'enregistrement!!!",
                    content = @Content)
    })
    @PostMapping("/")
    public Employe saveEmploye(@RequestBody Employe employe){
        log.info("Inside the saveEmploye of EmployeController");
        return employeService.saveEmploye(employe);
    }

    @Operation(summary = "Recherche un employé dans la  la base de données en fonction du Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Rechercher un département dans la base de donnée",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Département introuvable",
                    content = @Content)
    })

    @GetMapping("/{id}")
    public ResponseTemplate getEmploye(@PathVariable("id") Long employeId){
        return employeService.getEmployeWithDepartment(employeId);
    }
}
