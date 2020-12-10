package com.firas.telephones.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.firas.telephones.entities.Telephone;
import com.firas.telephones.service.TelephoneService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TelephoneRESTController {
	
	@Autowired
	TelephoneService telephoneService;
	
	@RequestMapping(method=RequestMethod.GET)
	List<Telephone> getAllTelephones()
	{
		return telephoneService.getAllTelephones();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Telephone getTelephoneById(@PathVariable("id") Long id) {
	return telephoneService.getTelephone(id);

	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Telephone createTelephone(@RequestBody Telephone telephone) {
	return telephoneService.saveTelephone(telephone); 
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Telephone updateTelephone(@RequestBody Telephone telephone) {
	return telephoneService.updateTelephone(telephone);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteTelephone(@PathVariable("id") Long id)
	{
	telephoneService.deleteTelephoneById(id);
	}
	
	@RequestMapping(value="/telscom/{idCom}",method = RequestMethod.GET)
	public List<Telephone> getTelephonesByComId(@PathVariable("idCom") Long idCom) {
	return telephoneService.findByCompanyIdCom(idCom);
	}
	}

