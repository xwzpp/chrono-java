package com.wanasit.chrono;

import java.util.ArrayList;
import java.util.List;

public abstract class Filter extends Refiner{
    
    public abstract boolean isValid(String text, ChronoOptions options, ParsedResult result);
    
    @Override
    public List<ParsedResult> refine(List<ParsedResult> results, String text, ChronoOptions options) {
        
        List<ParsedResult> filteredResults = new ArrayList<ParsedResult>();
        for (ParsedResult result : results) {
            if (isValid(text, options, result)) filteredResults.add(result);
        }
        
        return filteredResults;
    }
    
}