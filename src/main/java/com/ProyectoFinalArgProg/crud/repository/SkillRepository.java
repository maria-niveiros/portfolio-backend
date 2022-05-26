
package com.ProyectoFinalArgProg.crud.repository;

import com.ProyectoFinalArgProg.crud.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SkillRepository extends JpaRepository <Skill, Long> {
    
}
