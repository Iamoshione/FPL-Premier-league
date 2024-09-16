package com.example.SportyApi.controller;


import com.example.SportyApi.controller.http.HttpConnection;
import com.example.SportyApi.model.events.EventWrapper;
import com.example.SportyApi.service.eventwrapper.IEventWrapperService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/sporty/api")
public class FantasyPremierLeagueController {


    private final HttpConnection httpConnection;
    private final IEventWrapperService iEventWrapperService;


    public FantasyPremierLeagueController(HttpConnection httpConnection, IEventWrapperService iEventWrapperService) {
        this.httpConnection = httpConnection;
        this.iEventWrapperService = iEventWrapperService;
    }


    @GetMapping(value = "/save")
    public ResponseEntity<String> save() throws JsonProcessingException {
        JSONObject obj = httpConnection.base();
        ObjectMapper objectMapper = new ObjectMapper();
        EventWrapper eventWrapper = objectMapper.readValue(obj.toJSONString(), EventWrapper.class);
        iEventWrapperService.saveEventWrapper(eventWrapper);
        return ResponseEntity.ok("Saved");
    }


}

