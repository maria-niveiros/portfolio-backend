
package com.AP.portfolioWeb.repository;


import com.AP.portfolioWeb.entity.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AcercaDeRepository extends JpaRepository <AcercaDe, Long> {
       

}
