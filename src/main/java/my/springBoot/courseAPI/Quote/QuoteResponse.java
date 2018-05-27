package my.springBoot.courseAPI.Quote;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(
        ignoreUnknown = true)
public class QuoteResponse {

    private QuoteResponseSuccess success;
    private QuoteResponseContents contents;

    public QuoteResponse() {

    }


    public QuoteResponseSuccess getSuccess() {
        return success;
    }

    public void setSuccess(QuoteResponseSuccess success) {
        this.success = success;
    }

    public boolean isSuccess() {
        if (success != null && success.getTotal() > 0) {
            return true;
        }
        return false;
    }

    public QuoteResponseContents getContents() {
        return contents;
    }

    public void setContents(QuoteResponseContents contents) {
        this.contents = contents;
    }

    public Quote getQuote() {
        if (isSuccess()) {
            if (contents != null && contents.getQuotes().size() > 0) {
                return contents.getQuotes().get(0);
            }
        }
        return null;
    }

}