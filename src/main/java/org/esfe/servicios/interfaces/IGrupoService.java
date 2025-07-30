package org.esfe.servicios.interfaces;

import org.esfe.modelos.Grupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IGrupoService {
    Page<Grupo> buscarTodosPaginados(Pageable pageable);

    List<Grupo> obtenerTodos();

    Optional<Grupo> buscarPorId(Integer id);

    Grupo crearOEditar(Grupo grupo);

    void eliminarPorId(Integer id);
}
