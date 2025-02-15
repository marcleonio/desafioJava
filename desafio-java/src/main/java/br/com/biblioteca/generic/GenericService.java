package br.com.biblioteca.generic;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.transaction.annotation.Transactional;

public abstract class GenericService <E extends GenericEntity, DTO extends GenericDTO> {

    public abstract GenericRepository<E> getRepository();
    public abstract GenericMapper<E, DTO> getMapper();
    
    @Transactional
	public E adicionar(DTO dto) {

		var entity = getMapper().parseDTOToEntity(dto);
		
		return getRepository().save(entity);
	}

    @Transactional(readOnly = true)
	public E findById(Long id){
    	Optional<E> optional = getRepository().findById(id);
		return (optional.isPresent()) ? optional.get() : null;
	}

    @Transactional(readOnly = true)
    public List<E> findAll() {
        return getRepository().findAll();
    }

    @Transactional(readOnly = true)
	public List<DTO> listar(DTO dto) {
        E entity = getMapper().parseDTOToEntity(dto);
        return getMapper().listEntityToListDTO(getRepository().findAll(
                Example.of(entity,
                        ExampleMatcher.matching().withIgnoreNullValues().withIgnoreCase()
                                .withStringMatcher(StringMatcher.EXACT))));
    }

    @Transactional
	public void delete(Long codigo) {
		getRepository().deleteById(codigo); 
	}
}
