package com.JavaProblems;

import java.util.Comparator;

public class ComparatorExample_Checker {
	
	public Comparator<ComparatorExample_Player> desc =null;
	public  void Checker() {

        desc = new Comparator<ComparatorExample_Player>() {

            @Override
            public int compare(ComparatorExample_Player p1, ComparatorExample_Player p2) {
            	if(p1.score > p2.score)  return -1;
            	else if ( p1.score < p2.score ) return 1;
                else if ( p1.score == p2.score ) {
                    if ( p1.name.compareTo(p2.name) > 0 ) {
                        return -1;
                    } else return 1;
                } else return 0;      	
        }
    };

	}
}

