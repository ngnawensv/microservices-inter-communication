package cm.belrose.serviceemploye.service;

import cm.belrose.serviceemploye.dto.Departement;
import cm.belrose.serviceemploye.dto.ResponseTemplate;
import cm.belrose.serviceemploye.model.Employe;
import cm.belrose.serviceemploye.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeService {
    @Autowired
    private EmployeRepository employeRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Employe saveEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    public ResponseTemplate getEmployeWithDepartment(Long employeId) {
        ResponseTemplate responseTemplate=new ResponseTemplate();
        Employe employe=employeRepository.findById(employeId).get();
        Departement departement =restTemplate.getForObject("http://SERVICE-DEPARTEMENT/departements/"+employe.getDepartementId(),
                        Departement.class);
        responseTemplate.setEmploye(employe);
        responseTemplate.setDepartement(departement);

        return responseTemplate ;
    }
}
