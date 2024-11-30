package service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.UserDTO;
import entity.User;
import repository.UserRepository;
import valueObject.EmailUser;
import valueObject.Nome;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> listarUsers() {
        return userRepository.findAll().stream()
                .map(user -> new UserDTO(user.getName(), user.getEmail().getEmailAddress()))
                .collect(Collectors.toList());
    }

    public void salvarUser(UserDTO userDto) {
        User user = new User();

        user.setNome(new Nome(userDto.getNome()));
        user.setEmail(new EmailUser(userDto.getEmail()));

        userRepository.save(user);
    }

    public void deletarUser(Long id) {
        userRepository.deleteById(id);
    }

    public void atualizarUser(Long id, UserDTO userDto) {
        User user = userRepository.findById(id).orElseThrow();

        user.setNome(new Nome(userDto.getNome()));
        user.setEmail(new EmailUser(userDto.getEmail()));

        userRepository.save(user);
    }
}
