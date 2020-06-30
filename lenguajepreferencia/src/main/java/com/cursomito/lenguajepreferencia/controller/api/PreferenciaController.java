package com.cursomito.lenguajepreferencia.controller.api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.cursomito.lenguajepreferencia.entity.Preferencia;
import com.cursomito.lenguajepreferencia.service.PreferenciaService;

@RestController
@CrossOrigin
@RequestMapping("api/preferencia")
public class PreferenciaController {
	
	private static final Logger logger = LoggerFactory.getLogger(PreferenciaController.class);
	
	@Autowired
	private PreferenciaService service;
	
	@PostMapping(value="agregar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Preferencia> guardarPreferencia(@RequestBody Preferencia preferencia) {
		try {
			return new ResponseEntity<Preferencia>(service.guardarPreferencia(preferencia), HttpStatus.CREATED);
		}catch(Exception e) {
			logger.error("Error: ",e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping(value="listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Preferencia>> preferencias() {
		try {
			return new ResponseEntity<List<Preferencia>>(service.preferencias(), HttpStatus.OK);
		}catch(Exception e) {
			logger.error("Error: ",e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}

}