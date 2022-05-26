
package com.ProyectoFinalArgProg.crud.repository;

import com.ProyectoFinalArgProg.crud.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long> {
    
  
}
