package com.yrtwitter.project_phase2.media;

import com.yrtwitter.project_phase2.temporary.CommercialGenres;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class BusinessPost extends Post{

    HashMap<Person , LocalDateTime> viewed = new HashMap<>();

    public CommercialGenres postGenre;



}
