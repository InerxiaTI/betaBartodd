package com.inerxiait.apirestdemo.model.repository.userrole;

import com.inerxiait.apirestdemo.model.entity.userole.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserEntity extends CrudRepository<UserEntity, Long> {
    public UserEntity findByUsername(String username);

}
