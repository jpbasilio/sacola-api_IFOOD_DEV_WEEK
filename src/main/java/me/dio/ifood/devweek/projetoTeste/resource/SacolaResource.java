package me.dio.ifood.devweek.projetoTeste.resource;

import lombok.RequiredArgsConstructor;
import me.dio.ifood.devweek.projetoTeste.model.Item;
import me.dio.ifood.devweek.projetoTeste.model.Sacola;
import me.dio.ifood.devweek.projetoTeste.resource.dto.ItemDto;
import me.dio.ifood.devweek.projetoTeste.service.SacolaServise;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ifood-devweek/sacolas")
@RequiredArgsConstructor
public class SacolaResource {

    private final SacolaServise sacolaServise;

    @PostMapping
    public Item incluirItemNaSacola(@RequestBody ItemDto itemDto){
        return sacolaServise.incluirItemNaSacola(itemDto);
    }

    @GetMapping("/{id}")
    public Sacola verSacola(@PathVariable("id") Long id){
        return sacolaServise.verSacola(id);
    }

    @PatchMapping("/fecharSacola/{sacolaId}")
    public Sacola fecharSacola(@PathVariable("sacolaId") Long idSacola,
                               @RequestParam("formaPagamento") int formaPagamento){
        return sacolaServise.fecharSacola(idSacola, formaPagamento);
    }
}
