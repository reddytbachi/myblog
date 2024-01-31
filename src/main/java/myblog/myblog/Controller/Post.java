package myblog.myblog.Controller;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Posts")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Post {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private  String mobile;

    private String Email;
}
