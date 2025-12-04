package com.salesianostriana.dam.TareaEntidadesAsociaciones.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "redSocial")
public class RedSocial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private LocalDate fechaCreacion;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "red_social_usuario",
            joinColumns = @JoinColumn(name = "redSocial_id"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id"))
    @Builder.Default
    private Set<Usuario> usuarioList = new HashSet<>();


    //Helpers
    public void addUsuario(Usuario usuario){
        usuarioList.add(usuario);
        usuario.getRedSocialList().add(this);
    }

    public void removeUsuario(Usuario usuario){
        usuarioList.remove(usuario);
        usuario.getRedSocialList().remove(this);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        RedSocial redSocial = (RedSocial) o;
        return getId() != null && Objects.equals(getId(), redSocial.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
