package com.architecture.controller;

import java.util.ArrayList;
import java.util.List;

import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.architecture.entity.Information;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ResourceController {
	
	@Autowired
	private MongoCollection infos;
	
	private static final ObjectMapper MAPPER = new ObjectMapper(); 
	
	@RequestMapping(value = "/infos", method = RequestMethod.GET)
	public String getInfos() throws JsonProcessingException {
		List<Information> list = new ArrayList<>();
		MongoCursor<Information> all = infos.find().as(Information.class);
		while(all.hasNext()) {
			list.add(all.next());
		}
		return MAPPER.writeValueAsString(list);
	}
	
}
