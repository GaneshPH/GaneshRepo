package com.xworkz.oct11;

import com.xworkz.oct11.boot.*;

public class SongRunner {

	public static void main(String[] args) {
		Song chitraGeethe = new Song();
		
		chitraGeethe.name="kesariyaRangu";
		chitraGeethe.language="kannada";
		chitraGeethe.singer="sanjithHedge";
		chitraGeethe.lyricst="Amithab";
		chitraGeethe.type="movieSong";
		
		System.out.println(chitraGeethe.name);
		System.out.println(chitraGeethe.language);
		System.out.println(chitraGeethe.singer);
		System.out.println(chitraGeethe.lyricst);
		System.out.println(chitraGeethe.type);


	}

}
