public class Main {
    public static void main(String[] args) {
        String[][] booksAndAuthors = {
                {"War and Peace", "Leo Tolstoy"},
                {"Anna Karenina", "Leo Tolstoy"},
                {"Crime and Punishment", "Fyodor Dostoyevsky"},
        };

        task1(booksAndAuthors);
    }

    //Дан массив пар названий книг и авторов,
    // необходимо привести каждую пару в строку вида:
    // «Название книги» Имя Отчество Фамилия автора

    public static void task1(String[][] booksAndAuthors) {
        for (String[] booksAndAuthor :
                booksAndAuthors) {
            System.out.println(booksAndAuthor[0] + " " + booksAndAuthor[1]);

        }
    }
}