package my.springBoot.courseAPI.Quote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class QuoteController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private QuoteService quoteService;

    @RequestMapping(
            value = "/api/quotes/daily",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Quote> getQuoteOfTheDay() {
        logger.info("> getQuoteOfTheDay");

        Quote quote = quoteService.getDaily(QuoteService.CATEGORY_INSPIRATIONAL);

        if (quote == null) {
            return new ResponseEntity<Quote>(HttpStatus.NOT_FOUND);
        }
        logger.info("< getQuoteOfTheDay");
        return new ResponseEntity<Quote>(quote, HttpStatus.OK);
    }
}