import java.io.*;
import java.util.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int rollNo;
    private String name;
    private String address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Address: " + address;
    }
}

class SecondaryIndex implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private long position;

    public SecondaryIndex(String name, long position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public long getPosition() {
        return position;
    }
}

class StudentFile {
    private static final String STUDENT_FILE_NAME = "students.dat";
    private static final String INDEX_FILE_NAME = "index.dat";

    private RandomAccessFile studentFile;
    private Map<String, Long> index;

    public StudentFile() throws IOException {
        studentFile = new RandomAccessFile(STUDENT_FILE_NAME, "rw");
        index = loadIndex();
    }

    public void addStudent() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Roll No: ");
        int rollNo = Integer.parseInt(reader.readLine());

        System.out.print("Enter Name: ");
        String name = reader.readLine();

        System.out.print("Enter Address: ");
        String address = reader.readLine();

        long position = studentFile.length();
        studentFile.seek(position);
        studentFile.writeInt(rollNo);
        studentFile.writeUTF(name);
        studentFile.writeUTF(address);

        index.put(name, position);

        saveIndex();
        System.out.println("Student added successfully.");
    }

    public Student searchStudent() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Name to search: ");
        String name = reader.readLine();

        Long position = index.get(name);
        if (position != null) {
            studentFile.seek(position);
            int rollNo = studentFile.readInt();
            String studentName = studentFile.readUTF();
            String address = studentFile.readUTF();
            return new Student(rollNo, studentName, address);
        }
        return null;
    }

    public void deleteStudent() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Name to delete: ");
        String name = reader.readLine();

        Long position = index.get(name);
        if (position != null) {
            studentFile.seek(position);
            studentFile.writeInt(-1);  // Mark the record as deleted
            index.remove(name);
            saveIndex();
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private void saveIndex() throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(INDEX_FILE_NAME))) {
            outputStream.writeObject(index);
        }
    }

    @SuppressWarnings("unchecked")
    private Map<String, Long> loadIndex() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(INDEX_FILE_NAME))) {
            return (Map<String, Long>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new HashMap<>();
        }
    }

    public void close() throws IOException {
        studentFile.close();
    }
}

public class student_details {
    public static void main(String[] args) {
        try {
            StudentFile studentFile = new StudentFile();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Add a student");
                System.out.println("2. Search for a student");
                System.out.println("3. Delete a student");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(reader.readLine());

                switch (choice) {
                    case 1:
                        studentFile.addStudent();
                        break;
                    case 2:
                        Student student = studentFile.searchStudent();
                        if (student != null) {
                            System.out.println("Student found: " + student);
                        } else {
                            System.out.println("Student not found.");
                        }
                        break;
                    case 3:
                        studentFile.deleteStudent();
                        break;
                    case 4:
                        studentFile.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
