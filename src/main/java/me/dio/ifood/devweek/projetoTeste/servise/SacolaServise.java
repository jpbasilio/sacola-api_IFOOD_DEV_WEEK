package me.dio.ifood.devweek.projetoTeste.servise;

import me.dio.ifood.devweek.projetoTeste.model.Item;
import me.dio.ifood.devweek.projetoTeste.model.Sacola;

public interface SacolaServise {
    Item incluirItemNaSacola();
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
