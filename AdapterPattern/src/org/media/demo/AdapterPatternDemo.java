package org.media.demo;

import org.media.AudioPlayer;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "mp3 file name");
		audioPlayer.play("vlc", "vlc file name");
		audioPlayer.play("mp4", "mp4 file name");
		audioPlayer.play("mp3", "mp3 file name");
		audioPlayer.play("avi", "avi file name");
		
	}
}
