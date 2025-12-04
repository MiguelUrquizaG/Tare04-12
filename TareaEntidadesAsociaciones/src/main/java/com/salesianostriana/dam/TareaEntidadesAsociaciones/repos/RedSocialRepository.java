package com.salesianostriana.dam.TareaEntidadesAsociaciones.repos;

import com.salesianostriana.dam.TareaEntidadesAsociaciones.models.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedSocialRepository  extends JpaRepository<RedSocial,Long> {
}
