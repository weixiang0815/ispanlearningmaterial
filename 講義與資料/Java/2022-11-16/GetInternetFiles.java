package ch10;

public class GetInternetFiles {

	public static void main(String[] args) {
		GetFilesFromInternet gffi = new GetFilesFromInternet("c:\\images");
		gffi.getConsecutiveFiles
		("http://www.space-fox.com/wallpapers/celebs/penelope-cruz/penelope_cruz_", ".jpg", 
		1, 64
	    );

	}

}
