
package com.AP.portfolioWeb.repository;

import com.AP.portfolioWeb.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long> {
    
  
}
