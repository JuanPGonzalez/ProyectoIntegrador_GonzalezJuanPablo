/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jpgportfolio.jpg.Repository;

import com.jpgportfolio.jpg.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Juan Pablo Gonzalez
 */

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{

    
}