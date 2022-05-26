
package com.ProyectoFinalArgProg.crud.repository;

import com.ProyectoFinalArgProg.crud.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long> {


}
