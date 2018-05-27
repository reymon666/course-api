package my.springBoot.courseAPI.Quote;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(
        ignoreUnknown = true)
public class QuoteResponseContents {

    private ArrayList<Quote> quotes = new ArrayList<Quote>(0);

    public QuoteResponseContents() {

    }

    public ArrayList<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(ArrayList<Quote> quotes) {
        if (quotes == null) {
            this.quotes = new ArrayList<Quote>(0);
        }
        this.quotes = quotes;
    }

}