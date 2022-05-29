
package com.AP.portfolioWeb.repository;

import com.AP.portfolioWeb.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long> {


}
