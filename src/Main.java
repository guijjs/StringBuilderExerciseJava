import entities.Post;
import entities.Comment;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main{
  public static void main(String[] args){
    Post postagem1 = new Post(LocalDateTime.now(), "Traveling to New Zeland", "I'm going to visit this wonderful country!", 12);
    postagem1.addComment(new Comment("Have a nice trip!"));
    postagem1.addComment(new Comment("Wow that's awesome!"));
    System.out.println(postagem1.toString());

    Post postagem2 = new Post(LocalDateTime.now(), "Good Night guys!", "See you tomorrow", 5);
    postagem2.addComment(new Comment("Good night!"));
    postagem2.addComment(new Comment("May the Force be With you!"));
    System.out.println(postagem2.toString());
  }
}
