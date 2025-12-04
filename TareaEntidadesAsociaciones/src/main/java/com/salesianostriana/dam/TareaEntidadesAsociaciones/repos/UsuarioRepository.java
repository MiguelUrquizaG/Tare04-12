package com.salesianostriana.dam.TareaEntidadesAsociaciones.repos;

import com.salesianostriana.dam.TareaEntidadesAsociaciones.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
