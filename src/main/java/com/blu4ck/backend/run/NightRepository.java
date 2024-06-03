package com.blu4ck.backend.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@Repository
public class NightRepository {

    private List<Nights> nighty = new ArrayList<>();

    public List<Nights> findAll() {
        return nighty;
    }
    Optional <Nights> findById(Integer id){
        return nighty.stream()
                .filter(nights -> nights.id() == id)
                .findFirst();

    }
    void create (Nights nights){
        nighty.add(nights);
    }
    void update(Nights nights, Integer id) {
        Optional<Nights> existingNights = findById(id);
        if (existingNights.isPresent()){
            nighty.set(nighty.indexOf(existingNights.get()), nights);
        }
    }
    void delete(Integer id){
        nighty.removeIf(nights -> nights.id().equals(id));



}
    @PostConstruct
    private void init(){
        nighty.add(new Nights(1, "seqs"));

        nighty.add(new Nights(2, "kawga"));
    }

}
