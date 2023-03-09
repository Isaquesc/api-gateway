package br.projeto.pessoal.staff.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("staff")
public class ControlleStaff {

    @GetMapping
    public String getStaff() {
        return "Hello Staff";
    }
}
