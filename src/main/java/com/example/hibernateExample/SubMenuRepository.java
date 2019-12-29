package com.example.hibernateExample;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubMenuRepository extends CrudRepository<SubMenu, Integer>{

}
