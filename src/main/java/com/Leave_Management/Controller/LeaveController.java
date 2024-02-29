package com.Leave_Management.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Leave_Management.Entities.LeaveEn;
import com.Leave_Management.Service.LeaveService;
@Controller
public class LeaveController {
@Autowired
private LeaveService service;
@GetMapping("/")
public String home()
{
	return "home";
}
@GetMapping("/Leave_register")
  public String LeaveRegister() 
{
	return "leaveRegister";
}
@GetMapping("/About_us")
   public String AboutUs()
{
	return "AboutUs";
}
@GetMapping("/display_Leave")
public ModelAndView getAlleave() {
   List<LeaveEn>list=service.getAllLeave();
   return new ModelAndView("display_Leave","leaveEn",list);
	//return "display_leave";
}
@PostMapping("/save")
public String addleave(@ModelAttribute LeaveEn l) {
    service.save(l);
    return "redirect:/display_Leave"; // Corrected redirect path
}


@RequestMapping("/editLeave/{emp_id}")
public String editleave(@PathVariable("emp_id") int emp_id,Model model) {
	LeaveEn l=service.getLeaveById(emp_id);
	model.addAttribute("leaveEn",l);
	return "leaveEdit";
}

@RequestMapping("/deleteleave/{id}")
public String deleteleave(@PathVariable("id")int id) {
	service.deleteById(id);
	return "redirect:/display_Leave";
}




}