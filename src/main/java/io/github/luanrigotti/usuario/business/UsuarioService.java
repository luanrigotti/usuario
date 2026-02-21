package io.github.luanrigotti.usuario.business;

import io.github.luanrigotti.usuario.business.converter.UsuarioConverter;
import io.github.luanrigotti.usuario.business.dto.UsuarioDTO;
import io.github.luanrigotti.usuario.infrastructure.entity.Usuario;
import io.github.luanrigotti.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
