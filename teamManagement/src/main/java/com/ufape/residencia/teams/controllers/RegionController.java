package com.ufape.residencia.teams.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufape.residencia.teams.models.Region;

@RestController
@RequestMapping("/regions")
public class RegionController {	
	@GetMapping("/")
	public List<Region> indexRegions() {
		return null;
	}
	
	@PostMapping("/")
	public Region registerRegion(@RequestBody Region regionRequest) {
		return regionRequest;
	}
	
	@GetMapping("/{regionId}")
	public Region getRegion(@PathVariable long regionId) {
		return null;
	}
	
	@PutMapping("/")
	public Region updateRegion(@RequestBody Region regionRequest) {
		return regionRequest;
	}
	
	@DeleteMapping("/")
	public Boolean deleteRegion(@PathVariable long regionId) {
		return null;
	}
}
