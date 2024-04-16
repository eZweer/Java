package com.eZweer.entity;

import java.util.ArrayList;

public class Album {
	String name;
	ArrayList<Song> songs = new ArrayList<Song>();
	
	public Album(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Song> getSongs() {
		return songs;
	}
	public void setSongs(Song songs) {
		this.songs.add(songs);
	}
	public void playSongs() {
		for (Song s : songs)
		{
			s.play();
		}
	}
	
}
