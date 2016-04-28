/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.web.controller.cdi;

import br.edu.ifpb.pod.shared.service.ServiceFuncionario;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

/**
 *
 * @author jederson
 */
@ApplicationScoped
public class ProducerResource {

    @Produces
    @Resource(lookup = "java:global/Core/ServiceFuncionarioImpl")
    private ServiceFuncionario serviceFuncionario;
}
