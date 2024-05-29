package vn.hoidanit.laptopshop.repository;

import org.springframework.data.repository.Repository;

import vn.hoidanit.laptopshop.domain.User;

public interface UserRepository extends Repository<User, Long> {
  User save(User newUser);
}
