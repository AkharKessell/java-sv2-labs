package main.java.stringmethods.filename;

public class FileNameManipulatorMain {
    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        System.out.println(fileNameManipulator.findLastCharacter("box"));
        System.out.println(fileNameManipulator.findFileExtension("readme.txt"));
        System.out.println(fileNameManipulator.identifyFilesByExtension("exe", "test.exe"));
        System.out.println(fileNameManipulator.compareFilesByName("music.mp3", "music.MP3"));
        System.out.println(fileNameManipulator.changeExtensionToLowerCase("run.BAT"));
        System.out.println(fileNameManipulator.replaceStringPart("Doom.bat", "bat", "exe"));
    }

}
