package map;

import model.Vet;
import service.CrudService;

import java.util.Set;

public class VetServiceMap extends MapService<Vet,Long> implements CrudService<Vet,Long> {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet pet) {
        return super.save(pet.getId(),pet);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
