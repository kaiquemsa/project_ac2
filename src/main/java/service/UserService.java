package service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac2.ac2.repository.AlunoRepository;

import dto.UserDTO;
import entity.Aluno;
import entity.EmailAluno;

@Service
public class UserService {
    @Autowired
    private static AlunoRepository userRepository;

    public Aluno createUser(UserDTO userDTO) {
        Aluno user = new Aluno();
        user.setNome(userDTO.getName());
        user.setEmail(new EmailAluno(userDTO.getEmail()));
        return userRepository.save(user);
    }

    public static List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> {
                    UserDTO dto = new UserDTO();
                    dto.setName(user.getNome());
                    dto.setEmail(user.getEmail().getEmailAddress());
                    return dto;
                })
                .collect(Collectors.toList());
    }
}
