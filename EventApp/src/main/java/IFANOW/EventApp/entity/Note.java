package IFANOW.EventApp.entity;



import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;


@Entity
@Table(name = "notes")
public class Note implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String content;
    
    
	public Note(Long id, @NotBlank String title, @NotBlank String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
