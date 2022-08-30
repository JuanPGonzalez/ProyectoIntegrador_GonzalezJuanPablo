/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jpgportfolio.jpg.Security.Repository;

import com.jpgportfolio.jpg.Security.Entity.Rol;
import com.jpgportfolio.jpg.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Juan Pablo Gonzalez
 */

@Repository
public interface iRolRepository extends JpaRepository <Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
