package ibf.day11.ssf.workshop.day11.workshop.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/randomnumber")
public class NumberController {
    
    @GetMapping
    public String getRandomNumber(Model model){
        //Generate a random number from 0 to 30
        Random random = new Random();
        int randomNumber = random.nextInt(31);

        //Construct the image filename based on the randomNumber
        String imageName = "number" + String.valueOf(randomNumber) + ".jpg";
        System.out.println(imageName);
        //Add the filename to the model
        model.addAttribute("imageName", imageName);

        //Return the name of the Thymeleaf template to the render
        return "randomnumber";
    }
    

}
