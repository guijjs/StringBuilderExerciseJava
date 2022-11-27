package entities;
import entities.Comment;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
public class Post{
  private LocalDateTime moment;
  private String title;
  private String content;
  private Integer likes;
  private List<Comment> comments = new ArrayList<>();
  public Post(LocalDateTime moment, String title, String content, Integer likes){
    this.moment = moment;
    this.title = title;
    this.content = content;
    this.likes = likes;
  }
  public String getTitle(){
    return this.title;
  };
  public String getContent(){
    return this.content;
  };
  public Integer getLikes(){
    return this.likes;
  };
  public LocalDateTime getData(){
    return this.moment;
  }
  public void addComment(Comment comment){
    comments.add(comment);
  }
  public void removeComment(Comment comment){
    comments.remove(comment);
  };

  public String toString(){
    StringBuilder textPost = new StringBuilder();
    textPost.append(title + "\n");
    textPost.append(likes + " likes - " + moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "\n");
    textPost.append(content+"\n");
    textPost.append("Comments: \n");
    for(Comment comment : comments){
      textPost.append(comment.getComment() + "\n");
    };
    return textPost.toString();
  }
}
