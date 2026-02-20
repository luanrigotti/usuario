package io.github.luanrigotti.usuario.infrastructure.repository;


import io.github.luanrigotti.usuario.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
