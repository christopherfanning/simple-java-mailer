package dev.cfan.javamailer.mailer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private final MailService mailService;

    MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping("/sendMail")
    public String sendMail(@RequestParam String to,
                           @RequestParam String subject,
                           @RequestParam String text) {
        mailService.sendMail(to, subject, text);
        return "Mail sent successfully";
    }
}




