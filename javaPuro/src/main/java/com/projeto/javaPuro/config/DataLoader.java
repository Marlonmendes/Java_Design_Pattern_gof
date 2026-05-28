package com.projeto.javaPuro.config;

import com.projeto.javaPuro.model.Usuario;
import com.projeto.javaPuro.model.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final UsuarioRepository usuarioRepository;
    private final BCryptPasswordEncoder encoder;

    @Override
    public void run(String... args) {

        if (usuarioRepository.findByUsername("admin").isEmpty()) {

            Usuario usuario = new Usuario();

            usuario.setUsername("admin");

            usuario.setPassword(
                    encoder.encode("123456")
            );

            //Trocando para ADMIN vc tem acesso aos endpoints, colocando USER vc retira os acessos ao endpoint dando erro 403
            usuario.setRole("ADMIN");

            usuarioRepository.save(usuario);



            System.out.println("USUÁRIO ADMIN CRIADO");
        }
    }
}