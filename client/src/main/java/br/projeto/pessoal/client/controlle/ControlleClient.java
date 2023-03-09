package br.projeto.pessoal.client.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ControlleClient {

    @GetMapping()
    public String getClient() {
        return "Hello Client";
    }
}
