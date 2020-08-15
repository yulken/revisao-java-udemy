package secao13.exercicio02;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> comments = new ArrayList<Comment>();

	public Post() {
	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return this.likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}


	public List<Comment> getComments() {
		return this.comments;
	}

	public void addComment(Comment comment) {
		this.comments.add(comment);
	}
	public void removeComment(Comment comment) {
		this.comments.remove(comment);
	}
	


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(getMoment()) + '\n');
		sb.append(content + "\n");
		
		if (! getComments().isEmpty()){
			sb.append("Comments:\n");
			for (Comment c : comments) {
				sb.append(c.getText() + "\n");
			}
		} 		
		return sb.toString();

	}

}
