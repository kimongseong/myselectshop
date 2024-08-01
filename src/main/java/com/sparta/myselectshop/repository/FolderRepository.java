package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Folder;
import com.sparta.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface FolderRepository extends JpaRepository<Folder,Long> {
    List<Folder> findAllByUserAndNameIn(User user, Collection<String> name);
    // select * from folder where user_id = 1 and name in (`1`,`2`,`3`);

    List<Folder> findAllByUser(User user);


}