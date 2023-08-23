package com.example.WordCount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/translate")
public class Controller {
    @Autowired
    WorddService worddService;
    @GetMapping(("/addWord"))
    public String addWord(@RequestParam(required = false) String language,@RequestParam(required = false) String word) throws Exception {
        return worddService.addWord(language,word);
    }

    @GetMapping(("/getCount"))
    public Integer getCount(@RequestParam(required = false) String word) throws Exception {
        return worddService.getCount(word);
    }
}
