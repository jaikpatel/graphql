package com.jp.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {


    public String firstQuery(){
        return "Jai Patel";
    }


    public String secondQuery(){
        return "Kinnari Patel";
    }

}
