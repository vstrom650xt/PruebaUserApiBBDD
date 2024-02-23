package es.lavereda.pruebauser.service;

import es.lavereda.pruebauser.model.User;
import es.lavereda.pruebauser.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public User create(User user) {
            return userRepository.save(user);
        }

        public User update(User user) {
            return userRepository.save(user);
        }

        public User change(User user) {
            return userRepository.save(user);
        }

        public boolean remove(long id) {

            if (userRepository.existsById(id)) {
                userRepository.deleteById(id);
                return true;
            } else {
                return false;
            }
        }

        public Optional<User> find(long id) {
            return userRepository.findById(id);
        }
}
