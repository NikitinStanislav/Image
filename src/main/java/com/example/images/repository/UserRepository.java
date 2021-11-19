package com.example.images.repository;

import com.example.images.domain.User;
import org.springframework.data.repository.CrudRepository;


/**репозиторий позволяет найти полный список полей либо получить их по идентификатору
 *
 * спринг гайд говорит:
 * // This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
 * // CRUD refers Create, Read, Update, Delete*/
public interface UserRepository extends CrudRepository<User, Integer> {

}
