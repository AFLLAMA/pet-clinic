package map;

import model.Owner;
import service.CrudService;

import java.util.Set;

public class OwnerServiceMap extends MapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner pet) {
        return super.save(pet.getId(),pet);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
}
