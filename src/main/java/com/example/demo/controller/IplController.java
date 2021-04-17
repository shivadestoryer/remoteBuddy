package com.example.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.IPLSchedule;
import com.example.demo.repostiory.IPLRepository;


@RestController
public class IplController {
	
	

	@Autowired
	private IPLRepository repo;

	
	
	@GetMapping("/getAllMatches")
	public List<IPLSchedule> getMatches()
	{
		return (List<IPLSchedule>)repo.findAll();
	}
	
	@GetMapping("/{date}")
	public IPLSchedule getbydate(@PathVariable Date date)
	{
		return repo.findByDate(date);
	}
	
}