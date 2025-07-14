package com.example.demo.ClienteController;

import com.example.demo.dto.ClienteDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping("/cliente")
    public ResponseEntity<ClienteDto> getCliente() {

        ClienteDto cliente = new ClienteDto();
        // Asumiendo que tienes métodos setters en tu clase ClienteDto
        cliente.setNombre("Erick");
        cliente.setApellido("Reyes");
        cliente.setTelefono("2345-2345");
        cliente.setEdad(30);
        cliente.setDui("01234567-9");
        cliente.setNit("0614-290192-101-4");
        cliente.setAltura(1.85);
        cliente.setPeso(75.5);

        return ResponseEntity.ok(cliente);
    }

}
