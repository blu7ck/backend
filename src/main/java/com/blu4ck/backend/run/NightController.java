package com.blu4ck.backend.run;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/nights")
public class NightController {

    private final NightRepository nightRepository;


    public NightController (NightRepository nightRepository){
        this.nightRepository = nightRepository;
}
    @GetMapping("")
    List<Nights> findAll(){
        return nightRepository.findAll();
    }
    @GetMapping("/{id}")
    Nights findById(@PathVariable Integer id){
        Optional<Nights> nights =  nightRepository.findById(id);
        if(nights.isEmpty()){
            throw new NightNotFoundException();
        }
        return nights.get();

    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void create(@Valid @RequestBody Nights night){
        nightRepository.create(night);


}
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void update(@RequestBody Nights nights, @PathVariable Integer id){
        nightRepository.update(nights,id);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id) {
        nightRepository.delete(id);
    }
}
