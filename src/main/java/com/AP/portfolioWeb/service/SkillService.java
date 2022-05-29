
package com.AP.portfolioWeb.service;

import com.AP.portfolioWeb.entity.Skill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.AP.portfolioWeb.repository.SkillRepository;


@Service
public class SkillService  {

    @Autowired
    public SkillRepository skillRepo;

    
    public List<Skill> verSkills (){
      return skillRepo.findAll();
    }

  
    public void crearSkill (Skill sk){
      skillRepo.save(sk);
    }
   
    
    public void borrarSkill (Long id){
      skillRepo.deleteById(id);
    } 
 
   
    public Skill buscarSkill(Long id){
      return skillRepo.findById(id).orElse(null);
    }
    
   
    public void editarSkill (Long id, Skill sk){
         skillRepo.findById(id).map( editSk -> {
         editSk.setTecnologia(sk.getTecnologia());
         editSk.setImagen(sk.getImagen());

         return skillRepo.save(editSk);
      });
        //.orElseGet(() -> {
        //  acercade.setId(id);
        //  return acercadeRepo.save(acercade);
        //});
    }

        
            public Boolean existsSkill(Long id){
                try {
                  skillRepo.findById(id);
                   return true;
                 } catch(Exception e){
                    return false;
                 }
           }

          
       

}
