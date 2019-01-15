package cl.bice.core.activos.resumenoperfccactivos.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.bice.core.activos.resumenoperfccactivos.Greeting;

import cl.bice.core.activos.resumenoperfccactivos.service.ResumenOperService;
import cl.bice.core.activos.resumenoperfccactivos.to.RespuestaTO;
import cl.bice.core.activos.resumenoperfccactivos.to.ResumenRequestTO;

@RestController
public class ResumenOperController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    private final ResumenOperService resumenService;
    
    public ResumenOperController(final ResumenOperService resumenService) {
    	this.resumenService = resumenService;
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

	
	@PostMapping(value = "/resumen", consumes = MediaType.APPLICATION_JSON_VALUE)
    public RespuestaTO resumen(@RequestBody ResumenRequestTO rq) {
        return resumenService.getResumenOperFccActivos(rq.getTipoProducto(), rq.getRut(), rq.getDesde(), rq.getHasta());
    }   
	
	
}
