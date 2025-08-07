import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class Member {
  private String id;
  private String pwd;
  private String name;
  private String sex;
  private int age;
}
