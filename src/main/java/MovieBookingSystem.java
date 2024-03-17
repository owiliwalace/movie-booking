          import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MovieBookingSystem {
    public static void main(String[] args) {
        List<Movie> movies = generateMovieList();

        JFrame frame = new JFrame("Movie Booking System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton bookButton = new JButton("Book Movie");

        JComboBox<Movie> movieComboBox = new JComboBox<>(movies.toArray(new Movie[0]));

        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Movie selectedMovie = (Movie) movieComboBox.getSelectedItem();
                double price = selectedMovie.getPrice();
                String confirmationMessage = "Movie Booked: " + selectedMovie.getTitle() +
                        "\nPrice: $" + price +
                        "\nTime: " + selectedMovie.getTime();

                JOptionPane.showMessageDialog(null, confirmationMessage, "Booking Confirmation", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        panel.add(new JLabel("Select a Movie: "));
        panel.add(movieComboBox);
        panel.add(bookButton);

        frame.getContentPane().add(panel);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static List<Movie> generateMovieList() {
        List<Movie> movies = new ArrayList<>();
  movies.add(new Movie("The Shawshank Redemption", "Drama", 9.3, 12.99, "5:00 PM"));
movies.add(new Movie("The Godfather", "Crime", 9.2, 11.99, "6:30 PM"));
movies.add(new Movie("The Dark Knight", "Action", 9.0, 13.99, "7:45 PM"));
movies.add(new Movie("Forrest Gump", "Drama", 8.8, 10.99, "8:00 PM"));
movies.add(new Movie("Inception", "Sci-Fi", 8.8, 12.99, "6:00 PM"));
movies.add(new Movie("Pulp Fiction", "Crime", 8.9, 11.99, "9:30 PM"));
movies.add(new Movie("The Matrix", "Sci-Fi", 8.7, 10.99, "7:15 PM"));
movies.add(new Movie("Schindler's List", "Drama", 8.9, 12.99, "8:45 PM"));
movies.add(new Movie("Fight Club", "Drama", 8.8, 11.99, "9:00 PM"));
movies.add(new Movie("The Lord of the Rings: The Return of the King", "Fantasy", 8.9, 13.99, "6:45 PM"));
movies.add(new Movie("The Silence of the Lambs", "Thriller", 8.6, 11.99, "8:30 PM"));
movies.add(new Movie("Gladiator", "Action", 8.5, 12.99, "7:30 PM"));
movies.add(new Movie("Saving Private Ryan", "War", 8.6, 11.99, "9:15 PM"));

        // Add more movies...

        return movies;
    }
}

class Movie {
    private String title;
    private String category;
    private double rating;
    private double price;
    private String time;

    public Movie(String title, String category, double rating, double price, String time) {
        this.title = title;
        this.category = category;
        this.rating = rating;
        this.price = price;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return title + " - " + category + " - Rating: " + rating + " - $" + price;
    }
}
