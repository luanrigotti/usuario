package io.github.luanrigotti.usuario.infrastructure.repository;


import io.github.luanrigotti.usuario.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository <Telefone, Long> {
}
