package me.dio.ifood.devweek.projetoTeste.service;

import me.dio.ifood.devweek.projetoTeste.model.Item;
import me.dio.ifood.devweek.projetoTeste.model.Sacola;
import me.dio.ifood.devweek.projetoTeste.resource.dto.ItemDto;

public interface SacolaServise {
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
