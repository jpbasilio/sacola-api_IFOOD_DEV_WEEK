package me.dio.ifood.devweek.projetoTeste.repository;

import me.dio.ifood.devweek.projetoTeste.model.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SacolaRepository extends JpaRepository<Sacola, Long> {

}
