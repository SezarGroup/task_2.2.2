package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getCars(HttpServletRequest request, Model model) {
        int count = Integer.parseInt(request.getParameter("count"));
        List<Car> cars = (count >= Car.MAX_CARS_COUNT) ? carService.getAllCars() : carService.getCars(count);
        model.addAttribute("allCars", cars);
        return "cars";
    }
}
