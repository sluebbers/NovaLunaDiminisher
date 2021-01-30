package com.geilerscheiss.novaluna.api;

import com.geilerscheiss.novaluna.diminisher.Diminisher;
import com.geilerscheiss.novaluna.model.Card;
import com.geilerscheiss.novaluna.model.CardBoard;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletResponse;
import java.util.Set;

@RestController
public class DiminisherController {

    @GetMapping("/diminish")
    public CardBoard diminish(@RequestParam(value="cardset", required = true) String cardSet, HttpServletResponse response){
        if (StringUtils.hasLength(cardSet)){
            return diminishCardSet(cardSet);
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Request could not be processed");
        }
    }

    private CardBoard diminishCardSet(String cardSet) {
        Set<Card> cards = parseCardSet(cardSet);
        Diminisher diminisher = new Diminisher();
        return diminisher.diminishCardSet(cards);
    }

    private Set<Card> parseCardSet(String cardSet) {
        //TODO
        return null;
    }


    @ExceptionHandler({})
    public void handleException(){

    }
}
