package com.social.media.user.UserService.JPARepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.media.user.UserService.JPAEntities.User;

public interface UserRepository extends JpaRepository<User, Integer>  {

}
