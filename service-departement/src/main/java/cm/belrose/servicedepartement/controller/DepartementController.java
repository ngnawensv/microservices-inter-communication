package cm.belrose.servicedepartement.controller;

import cm.belrose.servicedepartement.model.Departement;
import cm.belrose.servicedepartement.service.DepartementService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departements")
@Slf4j
public class DepartementController {

    @Autowired
    private DepartementService departementService;

    @Operation(summary = "Enregistrer un département dans la  la base de données")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Enregistrement avec succès!!!",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Echec d'enregistrement!!!",
                    content = @Content)
    })

    @PostMapping("/")
    public Departement saveDepartement( @RequestBody Departement departement){
        log.info("inside the saveDepartement of DepartementController");
        return departementService.saveDepartement(departement);
    }

    @Operation(summary = "Recherche le département {} dans la  la base de données")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Rechercher un département dans la base de donnée",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Département introuvable",
                    content = @Content)
    })

    @GetMapping("{id}")
    public Departement findDepartemetById(@PathVariable("id") Long id){
        return departementService.findDepartemetById(id);
    }
}
