package pl.tk.spring.advert.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.tk.spring.advert.domain.model.Advert;

@Repository
public interface AdvertRepository extends JpaRepository<Advert, Long> {

}
