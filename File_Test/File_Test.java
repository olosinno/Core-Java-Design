import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Arrays;

public class File_Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeString(); // main method calls writeString method found in main class
        readString(); // main method calls readString method found in main class
        writeObject();
        readObject();
    }

    public static void writeString() throws IOException, ClassNotFoundException {
		File test = new File("journey.txt"); // creates new file in current directory

        FileWriter fw = new FileWriter(test); // enable writing of bytecode characters from file
        BufferedWriter bw = new BufferedWriter(fw); // enable writing from file writer object
/*
        PrintWriter pw = new PrintWriter(fos); // enable output to file output stream via PrintWriter object pw
        pw.print("Journey is the self-titled debut album by the band of the same name.  It was released in ");
        pw.print(1975);
        pw.println(" on Columbia Records.  Unlike their later recordings, this is a jazzy progressive rock album which focuses mainly on the band's instrumental talents.  It is the only album to include rhythm guitarist George Tickner among their personnel.\n");
*/

        /* Create a list of Player objects for array named band */
        Player Gregg = new Player("Gregg Rolie", 72, "lead vocals, keyboards");
		Player Neal = new Player("Neal Schon", 65, "lead guitar, background vocals");
		Player George = new Player("George Tickner", 73, "rhythm guitar, background vocals");
        Player Ross = new Player("Ross Valory", 70, "bass, background vocals");
        Player Aynsley = new Player("Aynsley Dunbar", 73, "drums");
        Player[] band = {Gregg, Neal, George, Ross, Aynsley};

        /* ForEach loop writes band array to file, passing through buffered reader, converting object to string */
        for(Player p : band) {
            bw.write(p.toString());
            bw.newLine();
        }

        bw.close(); // closes buffered writer stream
        fw.close(); // closes file writer stream
//		pw.close(); // close PrintWriter stream object

        System.out.println("The following have been written to 'journey.txt' file: \n" + Arrays.toString(band) + "\n");
    }

    public static void readString() throws FileNotFoundException, IOException {
		File test = new File("journey.txt"); // finds newly existing text file, not overwriting it

        if (test.exists() && test.isFile()) System.out.println("The file is both present and is indeed a file. \n");

        FileReader fr = new FileReader(test); // enable reading of bytecode characters from file
		BufferedReader br = new BufferedReader(fr); // enable reading from file reader object
       
        String str = br.readLine(); // initialized to first line in file 

        /* While loop checks for ending line, then prints line, reading next line */
        while (str != null) {
            System.out.println(str);
            str = br.readLine();
        }

        br.close(); // closes buffered reader stream
        fr.close(); // closes file reader stream
    }

    public static void writeObject() throws IOException {
        FileOutputStream fos = new FileOutputStream("objects.txt"); // creates instance of FOStream for OOStream use
        ObjectOutputStream oos = new ObjectOutputStream(fos); // enable saving of objects to a file

        Player Natalie = new Player("Natalie Portman", 34, "popular Hollywood actress");
        Player deceased = new Player("Diahann Carroll", 84, "legendary actress");

        oos.writeObject(Natalie); // writes object to object output stream
        oos.writeObject(deceased);

        oos.close(); // closes object output stream
        fos.close(); // closes file output stream
    }

    public static void readObject() throws ClassNotFoundException, IOException {
        File test = new File("objects.txt");

        FileInputStream fis = new FileInputStream(test); // creates new file in current directory
        ObjectInputStream ois = new ObjectInputStream(fis); // enable loading of objects from a file

        Player[] actress = new Player[2];
        actress[0] = (Player) ois.readObject();
        actress[1] = (Player) ois.readObject();
        System.out.println(actress[0]);
        System.out.println(actress[1]);

        ois.close(); // closes object input stream
        fis.close(); // closes file input stream
    }

    public static void byteReader() throws IOException {
		File test = new File("destination.txt"); // creates new file in current directory

		FileOutputStream fos = new FileOutputStream(test); // enable output of a byte sequence

		byte[] byteArray = {10, 20, 30, 40, 50, 60, 70, 80};
		fos.write(byteArray);
		fos.close(); // closes file output stream

		FileInputStream fis = new FileInputStream(test); // enable input of a byte array

		int fileSize = (int) test.length();
		byte[] byteArr = new byte[fileSize];
		fis.read(byteArr);

        for (int i = 0; i < byteArr.length; i++) System.out.println(byteArr[i]);

        fis.close(); // closes file input stream
	}
}

class Player implements Serializable {
	private static final long serialVersionUID = 1L;

    private String name;
    public String getName() { return name; }
	public void setName(String name) { this.name = name; }

    private int age;
    private String desc; // descriptor

    Player(String name, int age, String desc) {
		this.name = name;
        this.age = age;
        this.desc = desc;
	}

    @Override
	public String toString() {
		return "Band Player [" + name + "; Age " + age + "; " + desc + "]\n";
	}
}
