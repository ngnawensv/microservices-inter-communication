package cm.belrose.servicedepartement.service;

import cm.belrose.servicedepartement.model.Departement;
import cm.belrose.servicedepartement.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartementService {

    @Autowired
  private DepartementRepository departementRepository;

    public Departement saveDepartement(Departement departement) {

        return departementRepository.save(departement);
    }

    public Departement findDepartemetById(Long id) {
        return departementRepository.findById(id).get();
    }
}
