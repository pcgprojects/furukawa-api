package com.curso.furukawa.serviciorest;

import com.curso.furukawa.entidades.Cliente;
import com.curso.furukawa.negocio.Negocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/furukawa")
public class EmailServicioRest {

    @Value("${spring.mail.username}")
    private String fromMail;

    @Autowired
    private EmailService mailService;

    @GetMapping("/sendMail")
    public String sendMail()throws AddressException, MessagingException, IOException {
    //public String sendMail(@RequestParam("name") String name, @RequestParam("mail") String mail, @RequestParam("subject") String subject, @RequestParam("body") String body)throws AddressException, MessagingException, IOException {

        mailService.sendmail("rcportocarrero@gmail.com");
        return "send_mail_view";
    }


}
