package HomeWork2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{

    public static List<Student> readStudents(String fileName) throws IOException {
        try(Stream<String> lines = Files.lines(Paths.get(fileName))){
            return lines.map(line -> {
                String[] parts = line.split("\\|");
                String name = parts[0];

                List<Book> books = Arrays.stream(parts[1].split(";"))
                        .map(b -> {
                            String[] bookData = b.split(",");
                            return new Book(
                                    bookData[0],
                                    bookData[1],
                                    Integer.parseInt(bookData[2]),
                                    Integer.parseInt(bookData[3])
                            );
                        }).collect(Collectors.toList());

                return new Student(name, books);
            }).collect(Collectors.toList());
        }
    }

    public static void main(String[] args){
        try {
            List<Student> students = readStudents("C:\\Users\\Govdim\\Desktop\\Java\\AstonLearn\\HomeWork2\\students.txt");

            students.stream()
                    .peek(System.out::println)
                    .flatMap(s -> s.getBooks().stream())
                    .sorted(Comparator.comparingInt(Book::getPages))
                    .distinct()
                    .filter(b -> b.getYear() > 2000)
                    .limit(3)
                    .map(Book::getYear)
                    .findFirst()
                    .ifPresentOrElse(
                            y -> System.out.println("Год: " + y),
                            () -> System.out.println("Книга не найдена")
                    );
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
