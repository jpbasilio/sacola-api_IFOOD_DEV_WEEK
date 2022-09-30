package me.dio.ifood.devweek.projetoTeste.repository;

import me.dio.ifood.devweek.projetoTeste.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
}
