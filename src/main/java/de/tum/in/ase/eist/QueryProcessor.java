package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "david";
        } else if (query.toLowerCase().contains("plus")) {
            String[] splitquery = query.split(" ");
            return String.valueOf(Integer.parseInt(splitquery[2]) + Integer.parseInt(splitquery[4]));
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
