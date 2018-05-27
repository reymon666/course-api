package my.springBoot.courseAPI.Quote;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(
        ignoreUnknown = true)
public class QuoteResponseSuccess {


    private int total;

    public QuoteResponseSuccess() {

    }

    public int getTotal() {
        return total;
    }


    public void setTotal(int total) {
        this.total = total;
    }

}
