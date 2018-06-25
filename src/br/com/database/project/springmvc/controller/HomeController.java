package br.com.database.project.springmvc.controller;

import java.io.Serializable;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.database.project.model.Nurse;
import br.com.database.project.persistence.DaoFactory;
import br.com.database.project.persistence.dao.NurseDao;

@SuppressWarnings("serial")
@Controller
//@Scope("request")
public class HomeController implements Serializable
{
    private NurseDao nurseDao = DaoFactory.getInstance().getNurseDao();
    //@ResponseBody return jason
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView index(HttpSession session, String selecionado) throws Exception
	{
		ModelAndView model = new ModelAndView("home");
		return model;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(@RequestParam("choice") String choice, HttpSession session) throws Exception
	{
		ModelAndView model = new ModelAndView("register");
		if (choice.equals("Nurse"))
			model.addObject("typeclass", "nurse");
		else
			model.addObject("typeclass", "patient");
		
		Nurse nurse = new Nurse();
		
		model.addObject("nurse", nurse);
		model.addObject("type", choice);
		
		return model;
	}
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@RequestMapping(value = "/nurse", method = RequestMethod.GET)
	public ModelAndView nurse(@ModelAttribute("nurse") @Valid Nurse nurse, BindingResult result, HttpSession session) throws Exception
	{
		nurseDao.salva(nurse);
		
		ModelAndView model = new ModelAndView("home");
		
		return model;
		
	}
}